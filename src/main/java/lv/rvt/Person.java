package lv.rvt;


public class Person { 
    // Izņemot tās klases child vai sub klasses
    protected String name; 
    private int age; 
    private int weight; 
    private int height;
    private String address;
    private int salary;

    // All args constructor
    public Person(String name, int age, int weight, int height, String address, int salary) { 
        this.name = name; 
        this.age = age; 
        this.weight = weight; 
        this.height = height; 
        this.address = address;
        this.salary = salary;
    } 
    
    // Second constructor with only one parameter
    public Person(String name) {
        // this(name, 0, 0, 0);
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, String age, String weight, String height){
        this.name = name;
        this.age = Integer.valueOf(age);
        this.weight = Integer.valueOf(weight);
        this.height = Integer.valueOf(height);
    }


    public Person(String name, String address){
        this(name, 0, 0, 0, address, 0);
    }

    public Person(String name, String address, int salary) {
        this(name, 0, 0, 0, address, salary);
    }

    public void growOlder() {
        this.age = this.age + 1;
    }
    
    public void growOlder(int years) {
        this.age = this.age + years;
    }
 
    public boolean isOfLegalAge() { 
        return this.age <= 18; 
    } 

    @Override 
    public String toString() { 
        return this.name + "\n\t" + this.address;
    } 
     
    public void printPerson() { 
        System.out.println(this.name + ", age " + this.age + " years"); 
    } 
 
    public void setHeight(int newHeight) { 
        this.height = newHeight; 
    } 
 
    public void setWeight(int newWeight) { 
        this.weight = newWeight; 
    } 
 
    public void setName(String newName) {
        this.name = newName;
    }
    public double bodyMassIndex() { 
        double heigthPerHundred = this.height / 100.0; 
        return this.weight / (heigthPerHundred * heigthPerHundred); 
    } 
    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }

    // Person getter
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWeight() {
        return this.weight;
    }
    public String getAddress() {
        return this.address;
    }
    public int getSalary() {
        return this.salary;
    }
}