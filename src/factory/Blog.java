package factory;

import factory.webpages.AboutPage;
import factory.webpages.CommentPage;
import factory.webpages.ContactPage;
import factory.webpages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        siteType = WebsiteType.BLOG;
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }

}
