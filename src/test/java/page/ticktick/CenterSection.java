package page.ticktick;

import control.Label;
import org.openqa.selenium.By;

public class CenterSection {
    public Label inboxLabel = new Label(By.xpath("//div//h5[text()='Inbox']"));

    public Label getInboxLabel(){
        Label inboxLabel = new Label(By.xpath("//div//h5[text()='Inbox']"));
        return inboxLabel;
    }
}
