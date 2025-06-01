package com.icet.clothify.controller;


import com.icet.clothify.dto.BlogDTO;
import com.icet.clothify.service.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class BlogController {

    @Autowired
    BlogServices blogServices;

    @PostMapping("/set-data")
    public void setData(@RequestBody BlogDTO blogDTO) {

        System.out.println("helo");

        blogServices.setData(blogDTO);


    }
    @GetMapping("/get-data")
    public ArrayList<BlogDTO> getData() {

        System.out.println(blogServices.getData());

        return blogServices.getData();


    }



}
