package homepage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuTest {
    public static WebDriver driver;
    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    //1.2 This method should click on the menu whatever name is passed as parameter.
    //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
    //select the Menu and click on it and verify the page navigation.
    public void selectMenu(String menu){
        WebElement weblink=driver.findElement(By.name(menu));
        weblink.click();

    }
    @Test
    public void verifyPageNavigation(){
        selectMenu("");
    }
}
