package com.zett.quizzang.entities;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "quizzes")
public class Quiz extends EntityBase {
    private String title;
    private Integer duration;
    
    @OneToMany(mappedBy = "quiz")
    private Set<UserQuiz> userQuizzes;
    
    @OneToMany(mappedBy = "quiz")
    private Set<QuizQuestion> quizQuestions;
}