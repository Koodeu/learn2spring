package com.example.koodev.learn2spring;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private Long score;
    private String nickname;


    public Player(Long score, String nickname) {
        this.score = score;
        this.nickname = nickname;
    }




}
