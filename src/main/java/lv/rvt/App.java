package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[]args) {
        
    Account artosAccount = new Account("Artos account", 100);
    Account artosSwissAccount = new Account("Artos account in Switcherzland", 1000000);

    System.out.println("Initial state");
    System.out.println(artosAccount);
    System.out.println(artosSwissAccount);

    artosAccount.withdraw(20);
    System.out.println("The balance of Artos account is now" + artosAccount.balance());
    artosSwissAccount.deposit(200);
    System.out.println("The balance of Atos other is now: " + artosSwissAccount.balance());

    System.out.println("End state");
    System.out.println(artosAccount);
    System.out.println(artosSwissAccount);
   }
}