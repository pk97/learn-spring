package com.learning.learnspring.game;

public class GameRunner {
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }


    public void run() {
       game.up();
       game.down();
    }
}
