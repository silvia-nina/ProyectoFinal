package page.yopmail;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;
import session.Session;
import util.GetPropYopmail;

public class NewMessageSection {

    public TextBox toMessageTextBox = new TextBox(By.id("msgto"));
    //public TextBox toMessageTextBox = new TextBox(By.xpath("//input[@aria-label=\"Recipient\"]"));
    public TextBox subjectMessageTextBox = new TextBox(By.id("msgsubject"));
    public TextBox bodyMessageTextBox = new TextBox(By.id("msgbody"));
    public Button sendButton = new Button(By.id("msgsend"));


}
