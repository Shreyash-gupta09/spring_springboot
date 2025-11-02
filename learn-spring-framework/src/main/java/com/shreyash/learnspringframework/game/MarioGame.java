package com.shreyash.learnspringframework.game;

public class MarioGame  implements GamingConsole{
    public void up()
    {
        System.out.println("Mario Jumps Up");
    }
    public void down()
    {
        System.out.println("Mario Jumps Down");
    }
    public void left()
    {
        System.out.println("Mario Jumps Left");
    }
    public void right()
    {
        System.out.println("Mario Jumps Right");
    }
}
