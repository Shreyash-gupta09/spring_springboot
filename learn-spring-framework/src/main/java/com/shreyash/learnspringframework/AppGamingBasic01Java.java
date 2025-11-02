package com.shreyash.learnspringframework;

import com.shreyash.learnspringframework.game.GameRunner;
import com.shreyash.learnspringframework.game.PacMan;

public class AppGamingBasic01Java {
    public static void main(String[] args) {
        // var game=new MarioGame();
        // var game=new SuperContra();
        var game=new PacMan();
        var gameRunner=new GameRunner(game);
        gameRunner.run();
    }
}
