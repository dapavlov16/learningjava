package com.company;

public class Point {
    public int x;
    public int y;
    public Point(){}
    public Point(int a, int b){
        x = a;
        y = b;
    }
    public Point(String a, String b){
        x = Integer.parseInt(a) - 1;
        if (x > 9){
            x = (int)(Math.random() * 10);
        }
        y = Integer.parseInt(b) - 1;
        if (y > 9){
            y = (int)(Math.random() * 10);
        }
    }
    public void move(String ans){
        switch(ans){
            case "help":
                System.out.println("Вверх - up, u\nВниз - down, d\nВправо - right, r\nВлево - left, l\n");
                break;
            case "up":
            case "u":
                if(x == 0){
                    x = 9;
                }
                else {
                    x--;
                }
                break;
            case "d":
            case "down":
                if(x == 9){x = 0;}
                else{x++;}
                break;
            case "r":
            case "right":
                if(y == 9){y = 0;}
                else{y++;}
                break;
            case "l":
            case "left":
                if(y == 0){y = 9;}
                else{y--;}
                break;
            default:
                System.out.println("Неверная команда!(добавьте help для просмотра всех команд)");
                break;
        }
    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
}