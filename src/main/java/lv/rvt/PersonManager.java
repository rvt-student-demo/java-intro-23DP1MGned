package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception {
        ArrayList<Person> persons = new ArrayList<>();
        
        BufferedReader reader = Helper.getReader("persons.csv");
        reader.readLine();
        
        String line;
        while ((line = reader.readLine()) != null) {

            String[] parts = line.split(", ");
            
            if (parts.length >= 4) {
                try {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    int weight = Integer.parseInt(parts[2]);
                    int height = Integer.parseInt(parts[3]);
                    
                    Person person = new Person(name, age, weight, height);
                    persons.add(person);
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing line: " + line + " - skipping this person.");
                }
            }
        }
        reader.close();
        return persons;
    }

    public static void addPerson(Person person) throws IOException {
        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        
        writer.write(person.toCsvRow());
        writer.newLine();
        
        writer.close();
    }
}