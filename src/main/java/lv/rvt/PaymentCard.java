package lv.rvt;

public class PaymentCard {
    private double balance;
 
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "Card balance = " +balance+ " eur.";
    }
}

