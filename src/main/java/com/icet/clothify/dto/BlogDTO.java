package com.icet.clothify.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogDTO {

    private Long id;
    private String title;
    private String content;
    private String tags;
    private String category;
    private String commentsCount;
    private Date createdAt;
    private Date updatedAt;
    private String imgURL;

}
