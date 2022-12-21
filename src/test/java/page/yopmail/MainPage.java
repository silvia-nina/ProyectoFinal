package page.yopmail;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public TextBox nameMailTxtBox = new TextBox(By.id("login"));
    public Button loginButton = new Button(By.xpath("//button[@title=\"Check Inbox @yopmail.com\"]"));

    public Label labelMail = new Label(By.xpath("//div[@class='bname']"));

}
