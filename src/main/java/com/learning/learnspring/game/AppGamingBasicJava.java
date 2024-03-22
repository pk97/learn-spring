package com.learning.learnspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*

using ComponentScan we can tell Spring where to look for the beans/ which package the bean GameRunner will be present
*/

@ComponentScan("com.learning.learnspring.game")
public class AppGamingBasicJava {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppGamingBasicJava.class);

        applicationContext.getBean(GamingConsole.class).up();
        applicationContext.getBean(GameRunner.class).run();
        //g.run();
    }
}
