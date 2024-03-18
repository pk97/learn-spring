package com.learning.learnspring.game;

public class GameRunner {
    private Mario mario;
    public GameRunner(Mario mario) {
        this.mario = mario;
    }


    public void run() {
        System.out.println("Running Mario");
    }
}
