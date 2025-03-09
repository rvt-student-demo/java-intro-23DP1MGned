package lv.rvt; 
import java.util.*;
 
public class App { 
    public static void main(String[] args){
        Boxes box = new Boxes(10);
        Boxes box2 = new Boxes(20);
        
        box.add(new Book("Ernest Hemingway", "The Old Man and the Sea", 1.5));
        box.add(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 2.3));
        box.add(new Book("Stephen King", "The Shining", 1.2));

        box.add(new CD("The Beatles", "Sgt. Pepper's Lonely Hearts Club Band", 1967));
        box.add(new CD("Nirvana", "Nevermind", 1991));
        box.add(new CD("Coldplay", "Parachutes", 2000));


        box2.add(box);
    
        System.out.println(box2);
    
    }
}