package lv.rvt;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        printRectangle(17, 3);
    }

    public static void printRectangle(int width, int height) {
        for (int simb = 0; simb < height; simb++) {
        for (int strok = 0; strok < width; strok++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


    