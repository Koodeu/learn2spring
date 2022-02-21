package com.example.koodev.learn2spring.service;

import com.example.koodev.learn2spring.entity.PlayerEntity;
import com.example.koodev.learn2spring.dto.PlayerDto;
import com.example.koodev.learn2spring.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public PlayerDto addPlayer(PlayerDto playerDto) {
        PlayerEntity player = new PlayerEntity();
        player.setNickname(playerDto.getNickname());
        PlayerEntity saved = playerRepository.save(player);
        return new PlayerDto(saved.getId(), saved.getNickname());
    }

}
