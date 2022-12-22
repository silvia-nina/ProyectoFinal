package testSuite.ticktick;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.ticktick.*;
import session.Session;
import util.GetPropTick;

import java.util.Date;

public class ParserSteps {

    MainPage mainPage= new MainPage();
    LoginPage loginPage = new page.ticktick.LoginPage();
    CenterSection centerSection = new page.ticktick.CenterSection();
    SideSection sideSection = new SideSection();
    TaskListPage taskListPage = new TaskListPage();
    DeletePopUp deletePopUp = new DeletePopUp();
    String user= GetPropTick.getInstance().getUser();
    String password =GetPropTick.getInstance().getPwd();

    @Given("Open main page")

    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetPropTick.getInstance().getHost());
    }

    @Then("Login")
    public void login() {
        mainPage.loginButton.click();
        loginPage.emailTxtBox.setText(user);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();
        centerSection.getInboxLabel().waitControlIsInThePage();
        Assertions.assertTrue(centerSection.inboxLabel.isControlDisplayed(),"ERROR! the login was faield");
    }

    @Then("Test CRUD")
    public void testCRUD() {
        String taskCreated="MOJIX"+new Date().getTime();
        String taskUpdated="QA"+new Date().getTime();
//AddTaskList
        sideSection.addNewTaskList.click();
        taskListPage.nameTaskListTxtBox.setText(taskCreated);
        taskListPage.saveTaskButton.click();
        Assertions.assertTrue(sideSection.isTaskListDisplayedInList(taskCreated),"ERROR! The TaskList was not created") ;
//EditTaskList

        sideSection.clickOnTaskList(taskCreated);
        sideSection.listMenu.editButton.click();
        taskListPage.nameTaskListTxtBox.setText(taskUpdated);
        taskListPage.saveTaskButton.click();
        Assertions.assertTrue(sideSection.isTaskListDisplayedInList(taskCreated+taskUpdated),"ERROR! The TaskList was not created") ;

 //DeleteTaskList
        sideSection.clickOnTaskList(taskCreated+taskUpdated);
        sideSection.listMenu.deleteButton.click();
        deletePopUp.deleteButton.click();
        sideSection.getTaskList(taskCreated+taskUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(sideSection.isTaskListDisplayedInList(taskCreated+taskUpdated));

    }

    @Then("Close window")
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
