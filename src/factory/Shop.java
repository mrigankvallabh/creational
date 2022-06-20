package factory;

import factory.webpages.AboutPage;
import factory.webpages.CartPage;
import factory.webpages.ContactPage;
import factory.webpages.ItemPage;
import factory.webpages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        siteType = WebsiteType.SHOP;
        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
        pages.add(new ContactPage());
    }
}
