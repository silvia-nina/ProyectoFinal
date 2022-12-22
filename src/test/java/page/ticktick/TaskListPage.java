package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskListPage {
    public TextBox nameTaskListTxtBox= new TextBox(By.id("edit-project-name"));

    public Button saveTaskButton = new Button(By.xpath("//button[text()='Save']"));

}
