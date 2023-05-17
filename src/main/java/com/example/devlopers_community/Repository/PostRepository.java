package com.example.devlopers_community.Repository;

import com.example.devlopers_community.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Long>{
}
