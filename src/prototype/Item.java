package prototype;

public abstract class Item implements Cloneable {
    private String title;
    private String url;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }

    @Override
    public String toString() {
        return "Item [" +
            "title=" + title +
            ", price=" + price +
            ", url=" + url +
            "]"
        ;
    }

}
