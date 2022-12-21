package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TodayPage {
    public Button addTaskButton = new Button(By.xpath("//span[@class='icon_add']"));
    public TextBox nameTaskTxt= new TextBox(By.xpath("//span//br[@data-text='true']"));
    public Button createTaskButton = new Button(By.xpath("//span[text()='Add task']"));
    public Button cancelTaskButton = new Button(By.xpath("//span[text()='Cancel']"));


    public Label getTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return taskCreated;
    }

    public boolean isTaskDisplayedInList(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        return taskCreated.isControlDisplayed();

    }
    public void clickOnTask(String nameTask){
        Label taskCreated = new Label(By.xpath("//div[text()='"+nameTask+"']"));
        taskCreated.click();
    }
}
