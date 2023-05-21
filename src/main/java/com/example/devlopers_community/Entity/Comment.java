package com.example.devlopers_community.Entity;


import com.example.devlopers_community.BaseEntity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long comment_id;
    @Column
    private String writer;
    @Column
    private String content;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public void comment_update(Long comment_id, String writer, String content){
        this.comment_id = comment_id;
        this.content = content;
        this.writer = writer;
}
}
