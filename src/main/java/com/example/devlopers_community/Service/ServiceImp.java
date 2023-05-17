package com.example.devlopers_community.Service;

import com.example.devlopers_community.DTO.RegisterRequestDTO;
import com.example.devlopers_community.Entity.Post;

public interface ServiceImp {

    void Register();

    public default void DTOtoEntity(RegisterRequestDTO registerRequestDTO){
        Post post = Post.builder().
                type(registerRequestDTO.getType()).
                title(registerRequestDTO.getTitle()).
                content(registerRequestDTO.getTitle()).
                image(registerRequestDTO.getImage()).
                build();
    }
}
