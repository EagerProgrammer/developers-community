package com.example.devlopers_community.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateCommentRequestDTO {
    private Long comment_id;
    private String content;
    private String writer;
}
