package com.example.devlopers_community.DTO.Response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommentListDTO {
    private String writer;
    private String content;
}
