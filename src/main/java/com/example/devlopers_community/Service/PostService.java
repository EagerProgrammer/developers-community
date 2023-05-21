package com.example.devlopers_community.Service;

import com.example.devlopers_community.DTO.RegisterCommentDTO;
import com.example.devlopers_community.DTO.RegisterRequestDTO;
import com.example.devlopers_community.DTO.Response.CommentListDTO;
import com.example.devlopers_community.DTO.Response.ListPostResponse;
import com.example.devlopers_community.DTO.Response.PostResponse;
import com.example.devlopers_community.DTO.updateRequsetDTO;
import com.example.devlopers_community.Entity.Comment;
import com.example.devlopers_community.Entity.Post;
import com.example.devlopers_community.Repository.CommentRepository;
import com.example.devlopers_community.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService implements ServiceImp{
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    @Transactional
    @Override
    public void Register(RegisterRequestDTO registerRequestDTO) {
        Post post1 = DTOtoEntity(registerRequestDTO);
        postRepository.save(post1);
    }
    @Transactional
    public void update(updateRequsetDTO updateRequsetDTO) {
        Post post = postRepository.findById(updateRequsetDTO.getId())
                .orElseThrow(()->new IllegalArgumentException("시발"));
        post.updatePost(updateRequsetDTO.getType(), updateRequsetDTO.getTitle()
        , updateRequsetDTO.getContent(), updateRequsetDTO.getViews(), updateRequsetDTO.getLikes());
    }

//    @Transactional
    public PostResponse getPost() {
        List<Post> posts = postRepository.getPost();
        List<ListPostResponse> listPostResponse = posts.stream().map(i->{
            ListPostResponse listPostResponse1= ListPostResponse.builder()
                    .title(i.getTitle())
                    .commentList(i.getCommentList().stream().map(j->{
                        CommentListDTO commentListDTO1 = CommentListDTO.builder()
                                .content(j.getContent())
                                .writer(j.getWriter())
                                .build();
                        return commentListDTO1;
                    }).collect(Collectors.toList()))
                    .content(i.getContent())
                    .views(i.getViews())
                    .image(i.getImage())
                    .likes(i.getLikes())
                    .build();
            return listPostResponse1;
        }).collect(Collectors.toList());


        PostResponse postResponse = PostResponse.builder().data(listPostResponse).build();
        return postResponse;
    }
    @Transactional
    public void RegisterComment(RegisterCommentDTO registerCommentDTO){
        Post post = postRepository.findById(registerCommentDTO.getPost_id()).orElseThrow(()->new RuntimeException());
        Comment comment = Comment.builder().
                post(post)
                .writer(registerCommentDTO.getWriter())
                .content(registerCommentDTO.getContent())
                .build();
        commentRepository.save(comment);
    }
}

