import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class codersGuru {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://men-men-s-01.codersguru.pl/");
    }


    @Test
        public void testWebPage () {
        driver.findElement(By.tagName("facebook icon")).click(); //qrwa!

    }
    @Test
    public void fillRegistrationFormPrivateUser() {

        driver.navigate().to("https://men-men-s-01.codersguru.pl/register/");

//        driver.findElement(By.className("link main-page-top__email-input-sent"));
//        driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]")).click();
//        driver.findElement(By.xpath("//*[@id='person']")).click();


        driver.findElement(By.id("fos_user_registration_form_email")).sendKeys("Karol@ochkarol.pl");
        WebElement emailField = driver.findElement(By.id("fos_user_registration_form_email"));
        emailField.clear();
        emailField.sendKeys("Karol@ochkarol.pl");


        driver.findElement(By.id("fos_user_registration_form_name")).sendKeys("Karol");
        WebElement userName = driver.findElement(By.id("fos_user_registration_form_name"));
        userName.clear();
        userName.sendKeys("Karol");


        driver.findElement(By.id("fos_user_registration_form_lastname")).sendKeys("Kowalski");
        WebElement userLastName = driver.findElement(By.id("fos_user_registration_form_lastname"));
        userLastName.clear();
        userLastName.sendKeys("Kowalski");


        driver.findElement(By.id("fos_user_registration_form_plainPassword_first")).sendKeys("pies12");
        WebElement userPassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_first"));
        userPassword.clear();
        userPassword.sendKeys("pies12");


        driver.findElement(By.id("fos_user_registration_form_plainPassword_second")).sendKeys("pies12");
        WebElement userPasswordConfirmation = driver.findElement(By.id("fos_user_registration_form_plainPassword_second"));
        userPasswordConfirmation.clear();
        userPasswordConfirmation.sendKeys("pies12");

        driver.findElement(By.id("form_city")).sendKeys("Pińczów");
        WebElement userHomeTown = driver.findElement(By.id("form_city"));
        userHomeTown.clear();
        userHomeTown.sendKeys("Pińczów");

        driver.findElement(By.id("form_street")).sendKeys("Wmagająca");

        WebElement userStreet = driver.findElement(By.id("form_street"));
        userStreet.clear();
        userStreet.sendKeys("Wymagająca");

        driver.findElement(By.id("form_number")).sendKeys("9");
        WebElement userHome = driver.findElement(By.id("form_number"));
        userHome.clear();
        userHome.sendKeys("12");



        WebElement femaleRadioButton = driver.findElement(By.cssSelector("input[type='checkbox]"));
        femaleRadioButton.click();
        assertTrue(femaleRadioButton.isSelected());

        WebElement registerButton = driver.findElement(By.id("register-submit-btn"));
        registerButton.click();
    }



     @Test

        public void FillRegistrationFormProfesionallUser() {

//         driver.findElement(By.className("link main-page-top__email-input-sent"));
//         driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]")).click();
//         driver.findElement(By.xpath("//*[@id=\'person\']")).click();


//         driver.findElement(By.id("fos_user_registration_form_email")).sendKeys("Karol@ochkarol.pl");
         WebElement emailField = driver.findElement(By.id("fos_user_registration_form_email"));
         emailField.clear();
         emailField.sendKeys("Karol@ochkarol.pl");


//         driver.findElement(By.id("fos_user_registration_form_name")).sendKeys("Karol");
         WebElement userName = driver.findElement(By.id("fos_user_registration_form_name"));
         userName.clear();
         userName.sendKeys("Karol");


//         driver.findElement(By.id("fos_user_registration_form_lastname")).sendKeys("Kowalski");
         WebElement userLastName = driver.findElement(By.id("fos_user_registration_form_lastname"));
         userLastName.clear();
         userLastName.sendKeys("Kowalski");


//         driver.findElement(By.id("fos_user_registration_form_plainPassword_first")).sendKeys("pies12");
         WebElement userPassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_first"));
         userPassword.clear();
         userPassword.sendKeys("pies12");


//         driver.findElement(By.id("fos_user_registration_form_plainPassword_second")).sendKeys("pies12");
         WebElement userPasswordConfirmation = driver.findElement(By.id("fos_user_registration_form_plainPassword_second"));
         userPasswordConfirmation.clear();
         userPasswordConfirmation.sendKeys("pies12");

//         driver.findElement(By.id("form_city")).sendKeys("Pińczów");
         WebElement userHomeTown = driver.findElement(By.id("form_city"));
         userHomeTown.clear();
         userHomeTown.sendKeys("Pińczów");

//         driver.findElement(By.id("form_street")).sendKeys("Wmagająca");
         WebElement userStreet = driver.findElement(By.id("form_street"));
         userStreet.clear();
         userStreet.sendKeys("Wymagająca");

//         driver.findElement(By.id("form_number")).sendKeys("151");
         WebElement userHome = driver.findElement(By.id("form_number"));
         userHome.clear();
         userHome.sendKeys("151");



         WebElement femaleRadioButton = driver.findElement(By.cssSelector("input[type='checkbox]"));
         femaleRadioButton.click();
         assertTrue(femaleRadioButton.isSelected());

         WebElement registerButton = driver.findElement(By.id("register-submit-btn"));
         registerButton.click();

     }


     @Test

        public void orderMentorRemoteMeeting() {




     }





        @AfterMethod
        public void afterTest() {
            driver.close();
            driver.quit();

        }
    }
