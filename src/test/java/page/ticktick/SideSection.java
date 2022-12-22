package page.ticktick;

import control.Button;
import control.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;


public class SideSection {

    public Button addNewTaskList = new Button(By.xpath("//p[text()='Lists'] //following::button//*[local-name()='svg']//*[local-name()='use' and @*='#list-add']"));

    public Button menuTaskList = new Button(By.xpath("//div//p[text()='list1' and starts-with(@class,'text-s')]//following::div[1]//following::div[1]"));

    public ListMenu listMenu = new ListMenu();

    public boolean isTaskListDisplayedInList(String nameTaskList){
        Label taskListCreated = new Label(By.xpath("//div//p[text()='"+nameTaskList+"' and starts-with(@class,'text-s')]"));
        return taskListCreated.isControlDisplayed();

    }

    public void clickOnTaskList(String nameTaskList){
        Label taskListCreated = new Label(By.xpath("//div//p[text()='"+nameTaskList+"' and starts-with(@class,'text-s')]//following-sibling::div[1]//following-sibling::div//*[local-name()='svg']//*[local-name()='use' and @*='#more-for-folder']"));
        taskListCreated.click();
    }

    public Label getTaskList(String nameTaskList){
        Label taskListCreated = new Label(By.xpath("//div//p[text()='\"+nameTaskList+\"' and starts-with(@class,'text-s')]"));
        return taskListCreated;
    }

}
