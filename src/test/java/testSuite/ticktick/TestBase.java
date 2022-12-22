package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.ticktick.*;
import session.Session;
import util.GetPropTick;



public class TestBase {

    MainPage mainPage= new MainPage();
    LoginPage loginPage = new page.ticktick.LoginPage();
    CenterSection centerSection = new page.ticktick.CenterSection();
    SideSection sideSection = new SideSection();

    TaskListPage taskListPage = new TaskListPage();
    String user= GetPropTick.getInstance().getUser();
    String password =GetPropTick.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropTick.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
