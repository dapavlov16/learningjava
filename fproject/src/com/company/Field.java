package com.company;

public class Field {
    static int[][] f = new int[10][10];
    public Field() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                f[i][j] = 0;
            }
        }
    }
    public static void ppoint(Point p) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if((i == p.getX()) && (j == p.getY())){
                    f[i][j] = 1;
                }
                else{
                    f[i][j] = 0;
                }
            }
        }
    }
    public void printField(){
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
    }
}
