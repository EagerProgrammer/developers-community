package com.example.devlopers_community.Service;

import com.example.devlopers_community.DTO.RegisterRequestDTO;
import com.example.devlopers_community.DTO.updateRequsetDTO;
import com.example.devlopers_community.Entity.Post;
import com.example.devlopers_community.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService implements ServiceImp{
    private final PostRepository postRepository;

    @Override
    public void Register(RegisterRequestDTO registerRequestDTO) {
        Post post1 = DTOtoEntity(registerRequestDTO);
        postRepository.save(post1);
    }
    @Transactional
    public void update(updateRequsetDTO updateRequsetDTO) {
        String Title = "하이";
        Post post = postRepository.findByTitle(Title);
        post.updatePost(updateRequsetDTO.getType(), updateRequsetDTO.getTitle()
        , updateRequsetDTO.getContent(), updateRequsetDTO.getViews(), updateRequsetDTO.getLikes());
    }
}
