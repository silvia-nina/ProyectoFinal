package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testSuite.yopmail.TestBase;

import java.util.Date;

public class SendMailTest extends TestBase {
    @Test
    public void verifySendMail(){
        String subjectSent="MOJIX"+new Date().getTime();
        String bodySent="CONTENIDO"+new Date().getTime();

        mainPage.nameMailTxtBox.setText(user);
        mainPage.loginButton.click();
        Assertions.assertTrue(mainPage.labelMail.isControlDisplayed(),"ERROR! the login was faield");

        mailSection.createMailButton.click();
        iFrame.switchNewMail();
        newMessageSection.toMessageTextBox.setText(user);
        newMessageSection.subjectMessageTextBox.setText(subjectSent);
        newMessageSection.bodyMessageTextBox.setText(bodySent);
        newMessageSection.sendButton.click();
        iFrame.switchParent();
        mailSection.refreshMailButton.click();
        System.out.println("paso el refresh");
        iFrame.switchInbox();
        mailSection.getMail(subjectSent).waitControlIsInThePage();

        mailSection.clickOnMail(subjectSent);
        System.out.println("El mail llego correctamente");



    }

}
