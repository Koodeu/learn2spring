package com.example.koodev.learn2spring.controller;

import com.example.koodev.learn2spring.dto.PlayerDto;
import com.example.koodev.learn2spring.repository.PlayerRepository;
import com.example.koodev.learn2spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;



    @PostMapping(path = "/player")
    public PlayerDto addPlayer(PlayerDto playerDto) {

        return playerService.addPlayer(playerDto);
    }


}
