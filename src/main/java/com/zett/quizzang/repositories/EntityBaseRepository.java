package com.zett.quizzang.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zett.quizzang.entities.EntityBase;

public interface EntityBaseRepository extends JpaRepository<EntityBase, UUID>{

}
