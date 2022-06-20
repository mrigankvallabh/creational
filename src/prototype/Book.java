package prototype;

public class Book extends Item {
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + "[" + "ISBN=" + ISBN + "]";
    }

}
