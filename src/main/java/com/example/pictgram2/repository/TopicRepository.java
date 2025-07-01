package com.example.pictgram2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pictgram2.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    List<Topic> findAllByOrderByUpdatedAtDesc();
}