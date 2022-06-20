import factory.Website;
import factory.WebsiteFactory;
import factory.WebsiteType;

public class FactoryDemo {

    public static void main(String[] args) {

        Website blogSite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blogSite);

        Website shopSite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shopSite);

        Website site = WebsiteFactory.getWebsite();
        System.out.println(site);
    }
}
