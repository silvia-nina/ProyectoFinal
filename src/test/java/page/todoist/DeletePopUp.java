package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class DeletePopUp {
    public Button deleteButton = new Button(By.xpath("//span[text()='Delete']"));

    public Button cancelButton = new Button(By.xpath("//span[text()='Cancel']"));
}
