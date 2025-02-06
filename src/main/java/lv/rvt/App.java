package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;
import javax.sound.midi.Soundbank;
 
public class App { 
    public static void main ( String[] args )
    {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90018");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);
    }
}