package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Person pers1 = new Person("John");
        pers1.printPerson();
        for (int i = 0; i < 30; i++) {
            pers1.growOlder();
        }
        pers1.printPerson();


    }
}