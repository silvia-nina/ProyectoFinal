package page.yopmail;

import control.Button;
import control.Label;
import org.openqa.selenium.By;
import session.Session;

public class MailSection {
    public Button createMailButton = new Button(By.id("newmail"));
    public Button refreshMailButton = new Button(By.id("refresh"));



    public boolean isMailDisplayedInList(String nameMail){
        Label MailCreated = new Label(By.xpath("//div[text()='"+nameMail+"']"));
        return MailCreated.isControlDisplayed();

    }

    public void clickOnMail(String nameMail){
        Label mailCreated = new Label(By.xpath("//div[text()='"+nameMail+"']"));
        mailCreated.click();
    }
    public Label getMail(String nameMail){
        Label mailCreated = new Label(By.xpath("//div[text()='"+nameMail+"']"));
        return mailCreated;
    }
}
