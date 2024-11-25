package com.zett.quizzang.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zett.quizzang.entities.UserQuiz;

public interface UserQuizRepository extends JpaRepository<UserQuiz, UUID>{

}
