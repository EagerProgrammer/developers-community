package com.example.devlopers_community.Service;

import com.example.devlopers_community.DTO.RegisterRequestDTO;
import com.example.devlopers_community.Entity.Post;
import org.springframework.http.ResponseEntity;

public interface ServiceImp {

    void Register(RegisterRequestDTO registerRequestDTO);

    public default Post DTOtoEntity(RegisterRequestDTO registerRequestDTO){
        Post post = Post.builder().
                type(registerRequestDTO.getType()).
                title(registerRequestDTO.getTitle()).
                content(registerRequestDTO.getTitle()).
                image(registerRequestDTO.getImage()).
                build();
        return post;
    }
}
