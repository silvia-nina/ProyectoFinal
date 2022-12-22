package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtBox = new TextBox(By.id("emailOrPhone"));
    public TextBox passwordTxtBox = new TextBox(By.id("password"));
    public Button loginButton= new Button(By.xpath("//button[text()='Sign In']"));


    public void login(String user, String pwd){
        emailTxtBox.setText(user);
        passwordTxtBox.setText(pwd);
        loginButton.click();
    }

}
