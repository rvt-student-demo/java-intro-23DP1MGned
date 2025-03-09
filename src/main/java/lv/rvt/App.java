package lv.rvt; 
 
public class App { 
    public static void main(String[] args) {
        Box2 box = new Box2(9);

        box.add(new Book("Leo Tolstoy", "Anna Karenina", 3));
        box.add(new Book("Isaac Asimov", "Foundation", 1.8));
        box.add(new Book("Haruki Murakami", "Norwegian Wood", 0.9));

        box.add(new CD("Queen", "A Night at the Opera", 1975));
        box.add(new CD("The Rolling Stones", "Sticky Fingers", 1971));
        box.add(new CD("Daft Punk", "Random Access Memories", 2013));


        System.out.println(box);
    }
}