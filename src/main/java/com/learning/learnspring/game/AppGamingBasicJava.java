package com.learning.learnspring.game;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
