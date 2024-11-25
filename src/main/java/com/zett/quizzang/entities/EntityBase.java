package com.zett.quizzang.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime insertedAt;
    private String insertedBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
    private boolean isDeleted;
    
    @PrePersist
    protected void onCreate() {
        insertedAt = LocalDateTime.now();
    }
    
    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}