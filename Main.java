package demoGame;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame obj=new JFrame("Brick Breaker Game");
        GamePlay gameplay=new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);


    }
}
