package com.example.devlopers_community.Repository;

import com.example.devlopers_community.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PostRepository extends JpaRepository <Post, Long>{
    @Query("select p from Post p where p.title = :tit")
    Post findByTitle(@Param("tit") String title);
}
