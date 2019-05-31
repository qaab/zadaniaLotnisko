import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class codersGuruMentor {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://men-men-s-01.codersguru.pl/login");
    }


    @Test
    public void chooseMentor () {

        WebElement userName = driver.findElement(By.id("username"));
        userName.clear();
        userName.sendKeys("Karol@ochkarol.pl");


        WebElement userPass = driver.findElement(By.id("password"));
        userPass.clear();
        userPass.sendKeys("Pies12");





    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();

    }
}
