package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoist.*;
import session.Session;
import util.GetPropTodoist;

public class TestBase {
    MainPage mainPage= new MainPage();
    LoginPage loginPage = new LoginPage();
    CenterSection centerSection = new CenterSection();
    SideProject sideProject = new SideProject();
    ProjectPopUp projectPopUp = new ProjectPopUp();
    ProjectPage projectPage = new ProjectPage();
    DeletePopUp deletePopUp = new DeletePopUp();
    TodayPage todayPage = new TodayPage();
    TaskPopUp taskPopUp = new TaskPopUp();
    // todo property file
    String user= GetPropTodoist.getInstance().getUser();
    String password =GetPropTodoist.getInstance().getPwd();


    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropTodoist.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
