package com.mytraining.spring.springframework.games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameController {

    /*
       GameController is IoC Container for Spring Project.
       What we are launching up is IoC container in main class by using context.
     */
    @Autowired
     private GameConsole game;

    public GameController(GameConsole game) {
        this.game = game;
    }


    public void run(){
        game.down();
        game.left();
        game.right();
        game.up();
    }

}
