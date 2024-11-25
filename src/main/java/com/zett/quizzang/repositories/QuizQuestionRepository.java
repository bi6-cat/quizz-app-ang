package com.zett.quizzang.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zett.quizzang.entities.QuizQuestion;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, UUID> {

}
