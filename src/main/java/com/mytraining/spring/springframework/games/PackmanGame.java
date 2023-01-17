package com.mytraining.spring.springframework.games;
import org.springframework.stereotype.Component;
//@Component
public class PackmanGame implements GameConsole{

    /*
     Packman Game is a spring bean for Spring Project. All components are beans.
 */
    public void up(){
        System.out.println("jump");
    }

    public void down(){
        System.out.println("down into a hole");
    }

    public void right(){
        System.out.println("stop");
    }

    public void left(){
        System.out.println("accelerate");
    }
}
