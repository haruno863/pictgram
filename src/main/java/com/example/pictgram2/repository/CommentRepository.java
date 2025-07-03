package com.example.pictgram2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pictgram2.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}