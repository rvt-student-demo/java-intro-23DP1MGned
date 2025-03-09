package lv.rvt; 
 
public class App { 
    public static void main( String[] args ) {
        Box box = new Box( 3.2, 6.0, 6.0 );

        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("topArea: " + box.getTopArea());
        System.out.println(box);
    }
}