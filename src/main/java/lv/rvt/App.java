package lv.rvt; 
 
public class App { 
    public static void main( String[] args ) {
        Box box = new Box(3.5, 7.0, 6.0) ;
        Box box1 = new Box(box);
        Box box2 = new Box(box1);

        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("topArea: " + box.getTopArea());
        System.out.println(box);
        System.out.println(box1);
        System.out.println(box.smallerBox(box2));
    }
}