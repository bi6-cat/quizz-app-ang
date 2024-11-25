package com.zett.quizzang.entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role extends EntityBase {
    private String name;
    private String description;
    
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}