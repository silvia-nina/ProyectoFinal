package page.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class ListMenu {
    public Button editButton= new Button(By.xpath("//li[.//a[text()='Edit']]"));
    public Button deleteButton= new Button(By.xpath("//li[.//a[text()='Delete']]"));


}
