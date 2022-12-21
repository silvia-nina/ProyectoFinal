package testSuite.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDProjectTest extends TestBase {
    @Test
    public void verifyCRUDProject(){
        String projectCreated="MOJIX"+new Date().getTime();
        String projectUpdated="QA"+new Date().getTime();
        mainPage.loginButton.click();
        loginPage.emailTxtBox.setText(user);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();
        Assertions.assertTrue(centerSection.todayLabel.isControlDisplayed(),"ERROR! the login was faield");

        sideProject.addNewProjecButton.click();
        projectPopUp.nameProjectTxtBox.setText(projectCreated);
        projectPopUp.createProjectButton.click();
        Assertions.assertTrue(sideProject.isProjectDisplayedInList(projectCreated),"ERROR! the project was not created");

        sideProject.clickOnProject(projectCreated);
        projectPage.menuProject.menuIconButton.click();
        projectPage.menuProject.editButton.click();
        projectPopUp.nameProjectTxtBox.cleanSetText(projectUpdated);
        projectPopUp.saveProjectButton.click();
        Assertions.assertTrue(sideProject.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not created");

        sideProject.clickOnProject(projectUpdated);
        projectPage.menuProject.menuIconButton.click();
        projectPage.menuProject.deleteButton.click();
        deletePopUp.deleteButton.click();
        sideProject.getProject(projectUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(sideProject.isProjectDisplayedInList(projectUpdated),"ERROR! the project was not deleted");
    }

}
