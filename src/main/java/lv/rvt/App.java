    package lv.rvt; 
    import java.io.BufferedWriter;
    import java.nio.file.StandardOpenOption;
    import java.io.BufferedReader; 
    import java.util.*;
    import javax.sound.midi.Soundbank;
 
public class App { 
    public static void main(String[] args) {
        Person ada = new Person("Maksim Duhow", "London");
        Person esko = new Person("Sergo Bareckiy", "Helsinki");
        System.out.println(ada);
        System.out.println(esko);
    }
}