package com.example.devlopers_community.Entity;

import com.example.devlopers_community.BaseEntity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@DynamicInsert
@Where(clause = "deleted_at is null")
@SQLDelete(sql = "update post set deleted_at= CURRENT_TIME where post_id=?")
public class Post extends BaseEntity {
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
    private String writer;
    @Column
    @ColumnDefault("0")
    private Long likes;
    @Column
    @ColumnDefault("0")
    private Long views;

    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @OrderBy("created_at asc")
    private List<Comment> commentList;

    public void updatePost(String type, String title, String content, Long views, Long likes){
        this.type = type;
        this.title = title;
        this.content = content;
        this.views = views;
        this.likes = likes;

    }
}
