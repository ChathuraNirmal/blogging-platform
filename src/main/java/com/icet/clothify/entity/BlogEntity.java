package com.icet.clothify.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "blog_content")
public class BlogEntity {

    @Id
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;
    private String title;
    private String content;
    private String tags;
    private String category;
    @Column(name = "comments_count")
    private String commentsCount;
    @Column(name = "created_at", insertable = false, updatable = false)
    private Date createdAt;
    @Column(name = "updated_at", insertable = false, updatable = false)
    private Date updatedAt;
    @Column(name = "img_url")
    private String imgURL;

}
