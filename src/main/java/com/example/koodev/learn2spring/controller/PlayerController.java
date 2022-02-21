package com.example.koodev.learn2spring.controller;

import com.example.koodev.learn2spring.Player;
import com.example.koodev.learn2spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(path = "/web")
public class PlayerController {

    @Autowired
    public PlayerService playerService;

    @GetMapping(path = "/players")
    @ResponseBody
    public List<Player> getPlayers(){
        return playerService.getPlayerList();
    }

}
