package lv.rvt;

public class Product {
private double price;
private int quantity;
private String name;


public Product(String initialName, double initialPrice, int initialquant){
    this.name = initialName;
    this.price = initialPrice;
    this.quantity = initialquant;
}

public void ProductPrint(){
    System.out.println("Name: " + this.name + " Price: " + this.price + " Quant: " + this.quantity);
}
}
