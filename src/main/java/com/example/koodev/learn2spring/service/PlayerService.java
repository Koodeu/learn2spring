package com.example.koodev.learn2spring.service;

import com.example.koodev.learn2spring.entity.PlayerEntity;
import com.example.koodev.learn2spring.dto.PlayerDto;
import com.example.koodev.learn2spring.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerDto addPlayer(PlayerDto playerDto) {
        PlayerEntity player = new PlayerEntity();
        player.setNickname(playerDto.getNickname());
        player.setScore(playerDto.getScore());
        PlayerEntity saved = playerRepository.save(player);
        return new PlayerDto(saved.getId(), saved.getScore(),saved.getNickname());
    }


    public List<PlayerDto> findPlayer(String query){
        if (query==null || query.isBlank()){
            return playerRepository.findAll()
                    .stream()
                    .map(p -> new PlayerDto(p.getId(), p.getScore(), p.getNickname()))
                    .collect(Collectors.toList());
        }
        return playerRepository.findByNickname(query)
                .stream()
                .map(p -> new PlayerDto(p.getId(), p.getScore(),p.getNickname()))
                .collect(Collectors.toList());
    }

}
