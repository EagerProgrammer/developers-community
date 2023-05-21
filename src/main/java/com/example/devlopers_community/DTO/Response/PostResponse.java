package com.example.devlopers_community.DTO.Response;

import com.example.devlopers_community.Entity.Post;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class PostResponse {
    private List<ListPostResponse> data;

//    private List<> comments;
}
