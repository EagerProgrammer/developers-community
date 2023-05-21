package com.example.devlopers_community.RepositoryTest;

import com.example.devlopers_community.Entity.Post;
import com.example.devlopers_community.Repository.CommentRepository;
import com.example.devlopers_community.Repository.PostRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Replace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class Repository_Test {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;


    @Test
    public void Post_save() throws Exception{
        //given
        Post post = Post.builder().
                type("Q&A").
                content("테스트 코드용").
                title("테스트 입니다").
                image("no_image").hashTag("김정훈")
                .build();
        //when
        Post savepost = postRepository.save(post);
        //then
        Assertions.assertEquals("테스트 입니다", savepost.getTitle());

    }

}
