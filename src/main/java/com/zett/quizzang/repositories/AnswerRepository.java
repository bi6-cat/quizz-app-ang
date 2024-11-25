package com.zett.quizzang.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zett.quizzang.entities.Answer;

public interface AnswerRepository extends JpaRepository<Answer, UUID> {

}
