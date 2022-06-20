package factory;

import java.util.ArrayList;
import java.util.List;

import factory.webpages.Page;

public abstract class Website {

    protected WebsiteType siteType = WebsiteType.GENERAL;
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite(); // Abstract to be implemented by concrete classes

    @Override
    public String toString() {
        return siteType + " Website [pages=" + pages + "]";
    }

}
