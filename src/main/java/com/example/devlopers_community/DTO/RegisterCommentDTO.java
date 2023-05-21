package com.example.devlopers_community.DTO;

import com.example.devlopers_community.Entity.Post;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegisterCommentDTO {
    private Long post_id;
    private String writer;
    private String content;
}
