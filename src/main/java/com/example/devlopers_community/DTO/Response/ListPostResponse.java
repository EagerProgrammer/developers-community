package com.example.devlopers_community.DTO.Response;

import com.example.devlopers_community.Entity.Comment;
import com.example.devlopers_community.Entity.Post;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ListPostResponse {
    private String title;
    private String content;
    private String image;
    private Long likes;
    private Long views;
    private String hashtag;
    private List<CommentListDTO> commentList;
    private String type;
}
