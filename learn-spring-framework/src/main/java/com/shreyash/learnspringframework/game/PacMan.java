package com.shreyash.learnspringframework.game;

public class PacMan implements GamingConsole {
    public void up()
    {
        System.out.println("Pacman Jumps Up");
    }
    public void down()
    {
        System.out.println("Pacman Jumps Down");
    }
    public void left()
    {
        System.out.println("Pacman Jumps Left");
    }
    public void right()
    {
        System.out.println("Pacman Jumps Right");
    }
}
