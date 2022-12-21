package page.todoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class SideProject {

    public Button addNewProjecButton = new Button(By.xpath("//button[@aria-label=\"Add project\"]"));

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//span[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();

    }
    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//span[text()='"+nameProject+"']"));
        projectCreated.click();
    }
    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//span[text()='"+nameProject+"']"));
        return projectCreated;
    }
}
