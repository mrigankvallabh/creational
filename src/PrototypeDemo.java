import prototype.Book;
import prototype.Movie;
import prototype.Registry;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie m1 = (Movie) registry.createItem("Movie");
        Movie m2 = (Movie) registry.createItem("Movie");
        System.out.println(m2);

        m1.setTitle("Black Hawk Down");
        m1.setRuntime(137);
        m1.setPrice(18.99);
        m1.setUrl("www.blackhawkdown.info");

        System.out.println(m1);

        Book b1 = (Book) registry.createItem("Book");
        b1.setTitle("Alice In Wonderland");
        b1.setISBN("9022 39AD BF02 9669");

        System.out.println(b1);
    }
}
