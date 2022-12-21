package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectPopUp {
    public TextBox nameProjectTxtBox= new TextBox(By.xpath("//input[@id='edit_project_modal_field_name']"));
    public Button createProjectButton = new Button(By.xpath("//button[text()='Add']"));
    public Button saveProjectButton = new Button(By.xpath("//button[text()='Save']"));
}
