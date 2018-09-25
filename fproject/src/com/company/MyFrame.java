package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void CreateGUI(){
        JFrame frame = new JFrame("My first frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200, 200));
        frame.pack();
        frame.setVisible(true);
    }
}
