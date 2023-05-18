package com.example.devlopers_community.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class updateRequsetDTO {
    private String type;
    private String title;
    private String content;
    private Long views;
    private Long likes;
}
