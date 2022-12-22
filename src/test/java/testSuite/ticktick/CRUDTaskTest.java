package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import testSuite.ticktick.TestBase;

import java.time.Duration;
import java.util.Date;

public class CRUDTaskTest extends TestBase {
    @Test
    public void verifyCRUDTask(){
        String taskCreated="MOJIX"+new Date().getTime();
        String taskUpdated="QA"+new Date().getTime();
        mainPage.loginButton.click();
        loginPage.emailTxtBox.setText(user);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();
        centerSection.getInboxLabel().waitControlIsInThePage();
        Assertions.assertTrue(centerSection.inboxLabel.isControlDisplayed(),"ERROR! the login was faield");

        sideSection.addNewTaskList.click();
        taskListPage.nameTaskListTxtBox.setText(taskCreated);
        taskListPage.saveTaskButton.click();
        Assertions.assertTrue(sideSection.isTaskListDisplayedInList(taskCreated),"ERROR! The TaskList was not created") ;







    }
}
