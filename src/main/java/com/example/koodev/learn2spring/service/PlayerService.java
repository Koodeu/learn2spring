package com.example.koodev.learn2spring.service;

import com.example.koodev.learn2spring.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    private List<Player> playerList = new ArrayList<>();

    public PlayerService(List<Player> playerList) {
        this.playerList = playerList;
        Player player1 = new Player(12212L, "koodeu");
        Player player2 = new Player(331112L, "lambada");
        playerList.add(player1);
        playerList.add(player2);
        System.out.println("service created");
    }



    public List<Player> getPlayerList(){
        return playerList;
    }

}
