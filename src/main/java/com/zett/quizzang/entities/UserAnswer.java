package com.zett.quizzang.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_answers")
public class UserAnswer extends EntityBase {
    @ManyToOne
    @JoinColumn(name = "user_quiz_id")
    private UserQuiz userQuiz;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    
    @ManyToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;
}