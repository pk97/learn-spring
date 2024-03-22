package com.learning.learnspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);

        applicationContext.getBean(GamingConsole.class).up();
        applicationContext.getBean(GameRunner.class).run();
        //g.run();
    }
}
