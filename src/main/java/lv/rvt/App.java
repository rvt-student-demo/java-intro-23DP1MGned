package lv.rvt;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        printSquare(4);;
    }

    public static void printSquare(int size){
        int times = 0;
        for(int simb = 0; size>times;times++);
        for(int strok = 0; strok < size;strok++);
        System.out.println("*");
    }
    System.out.println();
}
    