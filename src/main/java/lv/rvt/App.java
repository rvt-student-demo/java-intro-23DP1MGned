package lv.rvt;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printSpaces(int size) {
        for (int simb = 0; size > simb; simb++) {
        for (int strok = 0; simb+1 > strok; strok++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


    