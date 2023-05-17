package com.example.devlopers_community.DTO;

import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
@Builder
public class RegisterRequestDTO {
    private String title;
    private String content;
    private String hashTag;
    private String image;
    private String type;

}
