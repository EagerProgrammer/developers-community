package com.example.devlopers_community.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
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
    private Long likes;
    @Column
    private Long views;
}
