package com.zett.quizzang.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "quiz_questions")
public class QuizQuestion extends EntityBase {
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    
    private Integer order;
}