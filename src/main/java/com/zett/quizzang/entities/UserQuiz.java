package com.zett.quizzang.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_quizzes")
public class UserQuiz extends EntityBase {
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    private String quizCode;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    
    @OneToMany(mappedBy = "userQuiz", cascade = CascadeType.ALL)
    private Set<UserAnswer> userAnswers;
}