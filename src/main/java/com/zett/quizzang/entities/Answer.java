package com.zett.quizzang.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "answers")
public class Answer extends EntityBase {
    private String content;
    private boolean isCorrect;
    
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}