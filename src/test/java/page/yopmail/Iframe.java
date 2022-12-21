package page.yopmail;

import session.Session;

public class Iframe {
    public void switchNewMail (){
        Session.getInstance().getBrowser().switchTo().frame("ifmail");
    }

    public void switchInbox (){
        Session.getInstance().getBrowser().switchTo().frame("ifinbox");
    }

    public void switchParent (){
        Session.getInstance().getBrowser().switchTo().parentFrame();
    }

    public void switchNone (){
        Session.getInstance().getBrowser().switchTo().defaultContent();
    }

}
