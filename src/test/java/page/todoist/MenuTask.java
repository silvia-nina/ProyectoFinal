package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class MenuTask {
    public Button deleteTaskButton= new Button(By.xpath("//div[text()='Delete task…']"));
    public Button deleteConfirmButton= new Button(By.xpath("//span[text()='Delete']"));
    public Button cancelConfirmButton= new Button(By.xpath("//span[text()='Cancel']"));

}
