package com.example.devlopers_community.Repository;

import com.example.devlopers_community.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
