package com.example.devlopers_community.Service;

import com.example.devlopers_community.DTO.RegisterCommentDTO;
import com.example.devlopers_community.DTO.RegisterRequestDTO;
import com.example.devlopers_community.DTO.Response.CommentListDTO;
import com.example.devlopers_community.DTO.Response.ListPostResponse;
import com.example.devlopers_community.Entity.Comment;
import com.example.devlopers_community.Entity.Post;
import com.example.devlopers_community.Repository.PostRepository;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface ServiceImp {

    void Register(RegisterRequestDTO registerRequestDTO);

     default Post DTOtoEntity(RegisterRequestDTO registerRequestDTO){
        Post post = Post.builder().
                type(registerRequestDTO.getType()).
                title(registerRequestDTO.getTitle()).
                content(registerRequestDTO.getTitle()).
                image(registerRequestDTO.getImage()).
                build();
        return post;
    }
}
