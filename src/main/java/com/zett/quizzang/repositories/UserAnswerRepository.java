package com.zett.quizzang.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zett.quizzang.entities.UserAnswer;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, UUID> {

}
