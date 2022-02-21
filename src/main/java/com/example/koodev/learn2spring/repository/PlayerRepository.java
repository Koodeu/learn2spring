package com.example.koodev.learn2spring.repository;


import com.example.koodev.learn2spring.dto.PlayerDto;
import com.example.koodev.learn2spring.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

    public List<PlayerDto> findByNickname(String query);
}
