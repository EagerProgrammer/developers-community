package com.example.devlopers_community.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@DynamicInsert
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long post_id;
    @Column
    private String type;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String hashTag;
    @Column
    private String image;
    @Column
    @ColumnDefault("0")
    private Long likes;
    @Column
    @ColumnDefault("0")
    private Long views;

    public void updatePost(String type, String title, String content, Long views, Long likes){
        this.type = type;
        this.title = title;
        this.content = content;
        this.views = views;
        this.likes = likes;

    }
}
