package lv.rvt; 
 
public class App { 
    public static void main(String[] args) {
        Book book1 = new Book("Leo Tolstoy", "War and Peace", 3);
        Book book2 = new Book("George Orwell", "1984", 1.5);
        Book book3 = new Book("J.R.R. Tolkien", "The Lord of the Rings", 2.2);

        CD cd1 = new CD("The Beatles", "Abbey Road", 1969);
        CD cd2 = new CD("Led Zeppelin", "IV", 1971);
        CD cd3 = new CD("Radiohead", "OK Computer", 1997);


        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}