package com.example.devlopers_community.Controller;

import com.example.devlopers_community.DTO.RegisterCommentDTO;
import com.example.devlopers_community.DTO.RegisterRequestDTO;
import com.example.devlopers_community.DTO.Response.PostResponse;
import com.example.devlopers_community.DTO.updateRequsetDTO;
import com.example.devlopers_community.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping("/post")
    public ResponseEntity Register(@RequestBody RegisterRequestDTO registerRequestDTO){
        postService.Register(registerRequestDTO);
        return  ResponseEntity.ok("Success");
    }
    @PutMapping("/update")
    public ResponseEntity update(@RequestBody updateRequsetDTO updateRequsetDTO){
        postService.update(updateRequsetDTO);
        return  ResponseEntity.ok("Success");
    }
    @GetMapping("/home")
    public ResponseEntity<PostResponse> GetPost(){
        PostResponse Posts = postService.getPost();
        return ResponseEntity.ok(Posts);
    }
    @PostMapping("/post/comment")
    public ResponseEntity CommentPost(@RequestBody RegisterCommentDTO registerCommentDTO){
        postService.RegisterComment(registerCommentDTO);
        return ResponseEntity.ok("Success");
    }

}
