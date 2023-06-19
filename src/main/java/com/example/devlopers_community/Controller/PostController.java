package com.example.devlopers_community.Controller;

import com.example.devlopers_community.DTO.*;
import com.example.devlopers_community.DTO.Response.DetailPostResponse;
import com.example.devlopers_community.DTO.Response.PostResponse;
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
    @PostMapping("/comment/update")
    public ResponseEntity CommentUpdate(@RequestBody UpdateCommentRequestDTO updateCommentRequestDTO){
        postService.UpdateComment(updateCommentRequestDTO);
        return ResponseEntity.ok("Success");
    }
    @DeleteMapping("/post/delete")
    public ResponseEntity DeletePost(@RequestBody DeleteRequest deleteRequest){
        postService.DeletePost(deleteRequest);
        return ResponseEntity.ok("Success");
    }
    @GetMapping("/post/detail")
    public  ResponseEntity DetailPost(@RequestParam Long PostNum, Long memberId){
       DetailPostResponse detailPostResponse =  postService.DetailPost(PostNum, memberId);
       return ResponseEntity.ok(detailPostResponse);
    }
}
