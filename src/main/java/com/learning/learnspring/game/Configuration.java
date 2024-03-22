package com.learning.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public GamingConsole console() {
        return new PacManGame();
    }

    @Bean
    GameRunner gameRunner(GamingConsole g) {
        return new GameRunner(g);
    }

    @Bean
    @Primary
    MarioGame marioGame() {
        return new MarioGame();
    }
}
