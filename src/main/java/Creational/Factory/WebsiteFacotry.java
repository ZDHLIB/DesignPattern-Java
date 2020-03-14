package Creational.Factory;

public class WebsiteFacotry {
    public static Website getWebsite(WebsiteEnum siteType){
        switch (siteType){
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default:{
                return null;
            }
        }
    }
}
