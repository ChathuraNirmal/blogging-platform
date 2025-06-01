package com.icet.clothify.service;

import com.icet.clothify.dto.BlogDTO;
import com.icet.clothify.entity.BlogEntity;
import com.icet.clothify.repository.BlogRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServices {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private BlogContentMapper blogContentMapper;

    public ArrayList<BlogDTO> getData() {

        List<BlogEntity> blogEntityList = blogRepository.findAll();

        ArrayList<BlogDTO> blogDTOS = new ArrayList<>();

        blogEntityList.forEach(each -> {

            blogDTOS.add(blogContentMapper.toDTO(each));

        });

        return blogDTOS;

    }

    public void setData(BlogDTO blogDTO) {

        if (blogDTO.getId() == null) blogDTO.setId(blogRepository.findTopByOrderByIdDesc().getId() + 1);


        BlogEntity blogEntity = blogContentMapper.toEntity(blogDTO);
        blogRepository.save(blogEntity);

    }

    public void delete(Long id){
        blogRepository.deleteById(id);
    }
}
