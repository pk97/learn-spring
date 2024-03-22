package com.learning.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    MarioGame() {
        System.out.println("Running Mario");
    }
    @Override
    public void up() {
        System.out.println("Up");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void right() {

    }

    @Override
    public void left() {

    }
}
