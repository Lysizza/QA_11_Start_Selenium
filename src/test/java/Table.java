import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Table {
    WebDriver wd;

    @BeforeMethod
    public void start(){
        wd = new ChromeDriver();
    //    System.setProperty("webdriver.chrome.driver","C:\\Users\\Alex\\Documents\\GitHub\\Start_QA_13\\chromedriver.exe");

        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        wd.manage().window().maximize();

    }
    @Test
    public void testMaria(){
        WebElement elMaria = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        wd.findElement(By.xpath("//tr[2]/td[2]"));
        wd.findElement(By.xpath("//*[text()='Maria Anders']"));

        String textMaria= elMaria.getText();
        System.out.println(textMaria);

        Assert.assertEquals(textMaria, "Maria Anders");
    }
    @AfterMethod
    public void post_condition(){

        wd.quit(); // all tabs

    }
}
