package com.example.devlopers_community.Repository;

import com.example.devlopers_community.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;


public interface PostRepository extends JpaRepository <Post, Long>{
//    public Post findByPost_id(Long Id);

    @Query("SELECT p from Post p join Fetch p.commentList order by p.created_at desc limit 50")
    public List<Post> getPost();
}
