package factory;

import factory.webpages.HomePage;

public class General extends Website {
    @Override
    public void createWebsite() {
        siteType = WebsiteType.GENERAL;
        pages.add(new HomePage());
    }
}
