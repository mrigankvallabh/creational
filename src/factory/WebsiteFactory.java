package factory;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        
        return switch (siteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
            default -> new General();
        };

    }

    public static Website getWebsite() {
        return new General();
    }

}
