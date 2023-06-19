package com.example.devlopers_community.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailPostResponse {
    private String title;
    private String content;
    private String type;
    private Long post_id;
    private String writer;
    private String image;
    private String hashTag;
    private List<CommentListDTO> comment;

}
