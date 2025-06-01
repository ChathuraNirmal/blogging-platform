package com.icet.clothify.service;
import com.icet.clothify.dto.BlogDTO;
import com.icet.clothify.entity.BlogEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlogContentMapper {
    BlogEntity toEntity(BlogDTO dto);
    BlogDTO toDTO(BlogEntity entity);
}
