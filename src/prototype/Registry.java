package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> itemsRegistry = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = itemsRegistry.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Jumanji");
        movie.setRuntime(129);
        movie.setPrice(18.99);

        Book book = new Book();
        book.setISBN("F233 2309 AA39 B038");
        book.setTitle("Core Java I");
        book.setPrice(24.99);
        book.setUrl("www.hortsmann.com/corejava");

        itemsRegistry.put("Movie", movie);
        itemsRegistry.put("Book", book);
    }

}
