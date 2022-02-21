package com.example.koodev.learn2spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDto {

    private Long score;
    private String nickname;

    public PlayerDto(Long score, String nickname) {
        this.score = score;
        this.nickname = nickname;
    }
}
