package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.Iframe;
import page.yopmail.MailSection;
import page.yopmail.MainPage;
import page.yopmail.NewMessageSection;
import session.Session;
import util.GetPropYopmail;

public class TestBase {

    MainPage mainPage= new MainPage();
    MailSection mailSection = new MailSection();
    NewMessageSection newMessageSection = new NewMessageSection();
    Iframe iFrame = new Iframe();

    String user= GetPropYopmail.getInstance().getUser();


    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropYopmail.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
