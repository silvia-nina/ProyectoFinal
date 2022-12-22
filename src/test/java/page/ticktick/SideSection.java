package page.ticktick;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class SideSection {

    public Button addNewTaskList = new Button(By.xpath("//p[text()='Lists'] //following::button//*[local-name()='svg']//*[local-name()='use' and @*='#list-add']"));

    public boolean isTaskListDisplayedInList(String nameTaskList){
        Label taskListCreated = new Label(By.xpath("//div//p[text()='"+nameTaskList+"' and starts-with(@class,'text-s')]"));
        return taskListCreated.isControlDisplayed();

    }
}
