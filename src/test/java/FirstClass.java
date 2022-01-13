import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstClass {

    WebDriver wd;

    @BeforeMethod
    public void pre_condition(){
        //open browser
        wd = new ChromeDriver();
        //open site
       wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
 //       wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");// with history
//        wd.navigate().back();
//        wd.navigate().forward();
//        wd.navigate().refresh();
//        wd.get("");//without history
        //login
    }

    @Test
    public void open_site(){
        //add new car
        System.out.println("hello");

        //* * * * * * * * * tagName * * * * * * * * * *
        WebElement element = wd.findElement(By.tagName("a"));


        List<WebElement> list1 = wd.findElements(By.tagName("a"));

        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("button"));

        //* * * * * * * * * ID * * * * * * * * * *
        WebElement element1 = wd.findElement(By.id("root"));

        //* * * * * * * * * Class * * * * * * * * * *
        WebElement element2 = wd.findElement(By.className("container"));

        //* * * * * * * * * ID * * * * * * * * * *

 //      WebElement element3 = wd.findElement(By.name(""));

        //* * * * * * * * * Link-Text * * * * * * * * * *
        WebElement element4 = wd.findElement(By.linkText("LOGIN"));
        element4.click();
  //      WebElement element5 = wd.findElement(By.partialLinkText("LOG"));

        //* * * * * * * * * css * * * * * * * * * *
        //* * * * * * * * * xPath * * * * * * * * *








    }

    @AfterMethod
    public void post_condition(){
        //close browser +url
        wd.close(); // one tab
        wd.quit(); // all tabs
        //logout
    }
}
