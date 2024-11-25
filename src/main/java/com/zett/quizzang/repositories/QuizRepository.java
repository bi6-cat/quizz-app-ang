package com.zett.quizzang.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zett.quizzang.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, UUID> {

}
