package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskPopUp {

    public MenuTask menuTask = new MenuTask();
    public Button nameTaskButton = new Button(By.xpath("//div[@aria-label=\"Task name\"]"));
    public TextBox nameTaskTxtBox= new TextBox(By.xpath("//span[@data-text='true']"));
    public Button  saveTaskButton = new Button(By.xpath("//span[text()='Save']"));

    public Button closeTaskButton = new Button(By.xpath("//button[@aria-label=\"Close modal\"]"));
    public Button moreOptionsButton = new Button(By.xpath("//button[@aria-label=\"More actions\"]"));




}
