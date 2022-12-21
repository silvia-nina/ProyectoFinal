package page.todoist;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton= new Button(By.xpath("//ul//li//a[text()='Log in']"));
    public Button signUpFreeButton = new Button(By.xpath("//ol//a[text()='Log in']"));
}
