package lv.rvt;
import java.util.ArrayList;

public class Boxes implements Packable {
    private double capacity;
    private ArrayList<Packable> element;

    public Boxes(double capacity) {
        this.capacity = capacity;
        this.element = new ArrayList<>();
    }

    public void add(Packable element) {
        double curentWeight = weight();
        if(capacity > curentWeight + element.weight()){
            this.element.add(element);
        }
    }

    @Override
    public String toString() {
        return "Box: " +this.element.size() + " items, total weight " + weight() + "kg";
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : element) {
            weight += packable.weight();
        }
        return weight;
    }

}
