package com.learning.learnspring.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {

    PacManGame() {
        System.out.println("running pacMan");
    }
    @Override
    public void up() {
        System.out.println("pacMan going up");
    }

    @Override
    public void down() {

    }

    @Override
    public void right() {

    }

    @Override
    public void left() {

    }
}
