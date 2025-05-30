package com.icet.clothify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "")
public class BlogEntity {

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
