package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@autocomplete=\"email\"]"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[@autocomplete=\"current-password\"]"));
    public Button loginButton= new Button(By.xpath("//button[@data-gtm-id=\"start-email-login\"]"));


    public void login(String user, String pwd){
        emailTxtBox.setText(user);
        passwordTxtBox.setText(pwd);
        loginButton.click();
    }

}
