package lv.rvt;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int number){
        int times = 0;
        while (times<number) {
            System.out.print("*");
            times++;
        }
        System.out.println();
    }
}
    