package factory.webpages;

public abstract class Page {

    private String title = "Home";

    public Page() { }

    public Page(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Page [title=" + title + "]";
    }

}
