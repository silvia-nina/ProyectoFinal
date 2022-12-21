package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MenuProject {
    public Button menuIconButton= new Button(By.xpath("//button[@aria-label=\"Project options menu\"]"));
    public Button editButton= new Button(By.xpath("//div[text()='Edit project']"));
    public Button deleteButton= new Button(By.xpath("//div[text()='Delete project']"));


}
