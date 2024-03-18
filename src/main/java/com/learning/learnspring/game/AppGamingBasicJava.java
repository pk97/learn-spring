package com.learning.learnspring.game;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var mario = new Mario();
        var gameRunner = new GameRunner(mario);
        gameRunner.run();
    }
}
