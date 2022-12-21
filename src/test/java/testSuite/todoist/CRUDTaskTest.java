package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTaskTest extends TestBase{
    @Test
    public void verifyCRUDTask(){
        String taskCreated="MOJIX"+new Date().getTime();
        String taskUpdated="QA"+new Date().getTime();
        mainPage.loginButton.click();
        loginPage.emailTxtBox.setText(user);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();
        Assertions.assertTrue(centerSection.todayLabel.isControlDisplayed(),"ERROR! the login was faield");

        todayPage.addTaskButton.click();
        todayPage.nameTaskTxt.setText(taskCreated);
        todayPage.createTaskButton.click();
        Assertions.assertTrue(todayPage.isTaskDisplayedInList(taskCreated),"ERROR! the task was not created");
        todayPage.cancelTaskButton.click();

        todayPage.clickOnTask(taskCreated);
        taskPopUp.nameTaskButton.click();
        taskPopUp.nameTaskTxtBox.setText(taskUpdated);
        taskPopUp.saveTaskButton.click();
        Assertions.assertTrue( taskPopUp.nameTaskButton.isControlDisplayed(),"ERROR! the task was not updated");
        taskPopUp.closeTaskButton.click();
        Assertions.assertTrue(todayPage.isTaskDisplayedInList(taskCreated+taskUpdated),"ERROR! the task was not updated");


        todayPage.clickOnTask(taskCreated+taskUpdated);
        taskPopUp.moreOptionsButton.click();
        taskPopUp.menuTask.deleteTaskButton.click();
        taskPopUp.menuTask.deleteConfirmButton.click();
        todayPage.getTask(taskUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(todayPage.isTaskDisplayedInList(taskUpdated),"ERROR! the task was not deleted");




    }
}
