package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame.CreateGUI();
            }
        });
        /*Game g = new Game();
        g.gameStart();*/
        /*for(int c = 0; c < 50; c++){
            System.out.println();
        }*/
    }
}
