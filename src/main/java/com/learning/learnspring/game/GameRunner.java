package com.learning.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole game;
    public GameRunner(@Qualifier("PacManGame") GamingConsole game) {
        this.game = game;
    }


    public void run() {
       game.up();
       game.down();
    }
}
