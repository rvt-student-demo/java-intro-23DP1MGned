package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
        String inputsString = scanner.nextLine();
        int input = Integer.parseInt(inputsString);
        numbers.add(input);
        System.out.println(numbers);    
        if ( input == -1){
            break;
        }
    System.out.println("From where: ");
    String inpString = scanner.nextLine();
    int inputnum = Integer.parseInt(inputsString);
    System.out.println(numbers.get(inputnum));
    }
        
        
}

}