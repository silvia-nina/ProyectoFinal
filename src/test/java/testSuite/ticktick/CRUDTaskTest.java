package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTaskTest extends TestBase {
    @Test
     public void verifyCRUDTask(){
        String taskCreated="MOJIX"+new Date().getTime();
        String taskUpdated="QA"+new Date().getTime();
//Login

        mainPage.loginButton.click();
        loginPage.emailTxtBox.setText(user);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();
        centerSection.getInboxLabel().waitControlIsInThePage();
        Assertions.assertTrue(centerSection.inboxLabel.isControlDisplayed(),"ERROR! the login was faield");

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
}
