package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[]args) {
    ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("Range [0,5]");
        printNumbersInRange(numbers, 0, 0);

        System.out.println("Range [3,10]");
        printNumbersInRange(numbers, 0, 0);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int input = Integer.parseInt(inputString);
        
    }
}