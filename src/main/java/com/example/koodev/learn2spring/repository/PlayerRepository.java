package com.example.koodev.learn2spring.repository;


import com.example.koodev.learn2spring.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
