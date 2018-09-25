package com.company;

import java.util.Scanner;

public class Game {
    String x;
    String y;
    Scanner in = new Scanner(System.in);
    Point p = new Point();
    Field f = new Field();
    public void gameStart() {
        System.out.print("Откуда начнём? (отсчёт от верхнего левого угла)\nВведите координаты: ");
        x = in.next();
        y = in.next();
        p = new Point(x, y);
        f.ppoint(p);
        f.printField();
        for(;;) {
            System.out.print("Введите команду: ");
            String command = in.next();
            switch (command) {
                case "help":
                    System.out.println("Список команд:\n\tmove (направление) - перемещение\n\t" +
                            "replace x y - переставить точку\n\tquit - закончить игру");
                    break;
                case "move":
                    p.move(in.next());
                    f.ppoint(p);
                    f.printField();
                    break;
                case "replace":
                    p = new Point(in.next(), in.next());
                    f.ppoint(p);
                    f.printField();
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("Неверная команда!");
                    break;
            }
        }
    }
    /*public boolean iscoord(String a){
        if((a.charAt(0) > 48) && (a.charAt(0) < 58)){
            return true;
        }
        else {
            return false;
        }
    }*/
}
