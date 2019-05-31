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



//        Select roleDropDown = new Select(driver.findElement(By.name("role")));
//        roleDropDown.selectByVisibleText("Manager");
//        Select jobDropDown = new Select(driver.findElement(By.name("expectation")));
//        jobDropDown.selectByVisibleText("High salary");
//        driver.findElement(By.xpath("//label[text()='Read books']")).click();
//        driver.findElement(By.id("comment")).sendKeys("This is comment");
//        driver.findElement(By.id("submit")).click();
//        assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
//    }







//    @Test
//    public void typingIntoWebElementTest(){
//        WebElement userNameField = driver.findElement(By.id("username"));
//        userNameField.sendKeys("Albert Einstein");
//
//        String typeUserNameValue = userNameField.getAttribute("value");
//
//        assertEquals(typeUserNameValue,"Albert Einstein");
//
//    }



//    @Test
//    public void filePickingTest(){
//        WebElement uploadFilePicker = driver.findElement(By.id("upload_file"));
//        uploadFilePicker.sendKeys("C:\\test.jpg");
//    }
//
//    @Test
//    public void secondFilePickingTest(){
//        WebElement uploadFilePicker = driver.findElement(By.id("upload_file"));
//        uploadFilePicker.sendKeys("C:\\test.txt");
//
//    }

//    @Test
//    public void typyingAndClearingValueInsideWebElementTest(){
//        WebElement userNameField = driver.findElement(By.id("username"));
//        userNameField.sendKeys("Selenium Start");
//        String typeUserNameValue = userNameField.getAttribute("value");
//        assertEquals(typeUserNameValue, "Selenium Start");
//    }




//    @Test
//    public void checkboxButtonTest(){
//
//        WebElement pizzaCheckbox = driver.findElement(By.cssSelector("input[value='pizza']"));
//        WebElement spaghettiCheckbox = driver.findElement(By.cssSelector("input[value='spaghetti']"));
//        WebElement hamburgerCheckbox = driver.findElement(By.cssSelector("input[value='hamburger']"));
//
//        assertFalse(pizzaCheckbox.isSelected());
//        assertFalse(spaghettiCheckbox.isSelected());
//        assertFalse(hamburgerCheckbox.isSelected());
//
//
//        pizzaCheckbox.click();
//        spaghettiCheckbox.click();
//        hamburgerCheckbox.click();
//
//        assertTrue(pizzaCheckbox.isSelected());
//        assertTrue(spaghettiCheckbox.isSelected());
//        assertTrue(hamburgerCheckbox.isSelected());
//
//
//        pizzaCheckbox.click();
//        spaghettiCheckbox.click();
//        hamburgerCheckbox.click();
//
//
//        assertFalse(pizzaCheckbox.isSelected());
//        assertFalse(spaghettiCheckbox.isSelected());
//        assertFalse(hamburgerCheckbox.isSelected());
//    }

//    @Test
//    public void dropDownListingTest() {
//
//        WebElement countryWebElement = driver.findElement(By.id("country"));
//        Select countryDropDown = new Select(countryWebElement);
//
//        List<WebElement> options = countryDropDown.getOptions();
//        List<String> namesOfOptions = new ArrayList<String>();
//
//        for (WebElement option : options) {
//            namesOfOptions.add(option.getText());
//
//            namesOfOptions.add(option.getText());
//
//            System.out.println(option.getText());
//
//            List<String> expectedNamesOfOptions = new ArrayList<String>();
//            expectedNamesOfOptions.add("Germany");
//            expectedNamesOfOptions.add("Poland");
//            expectedNamesOfOptions.add("UK");
//
//
//            assertEquals(namesOfOptions, expectedNamesOfOptions);
//
//        }
//
//    }
//

//        @Test
//        public void selectingOptionsFromDropDOwnTestOne (){
//       by index metoda get tekst
//            WebElement countryWebElement = driver.findElement(By.id("country"));
//            Select countryDropDown = new Select(countryWebElement);
//
//            countryDropDown.selectByIndex(1);
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Poland");
//        }
//
//        @Test
//        public void selectingOptionsFromDropDownTestTwo(){
//      by value
//            WebElement countryWebElement = driver.findElement(By.id("country"));
//            Select countryDropDown = new Select(countryWebElement);
//
//            countryDropDown.selectByIndex(1);
//
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Poland");
//
//            countryDropDown.selectByValue("de_DE");
//
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Germany");
//    }
//
//        @Test
//        public void selectingOptionsFromDropDownTestTree() {
//      by visible test
//            WebElement countryWebElement = driver.findElement(By.id("country"));
//            Select countryDropDown = new Select(countryWebElement);
//
//            countryDropDown.selectByIndex(1);
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Poland");
//
//            countryDropDown.selectByValue("de_DE");
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Germany");
//
//            countryDropDown.selectByVisibleText("UK");
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "UK");
//
//        }
//
//
//        @Test
//        public void selectingOptionsFromDropDownTestFour(){
//
//            WebElement countryWebElement = driver.findElement(By.id("country"));
//            Select countryDropDown = new Select(countryWebElement);
//
//
//
//            countryDropDown.selectByIndex(1);
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Poland");
//
//            countryDropDown.selectByValue("de_DE");
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Germany");
//
//            countryDropDown.selectByVisibleText("UK");
//            assertEquals(countryDropDown.getFirstSelectedOption().getText(), "UK");
//        }
//
//
//        @Test
//        public void checkIfElementOnPageTest(){
//
//            WebElement usernameField = driver.findElement(By.id("username"));
//            WebElement passwordField = driver.findElement(By.id("password"));
//            WebElement emailLabel = driver.findElement(By.cssSelector("span[class='help-block']"));
//
//            System.out.println("Is usernameField displayed: " + usernameField.isDisplayed());
//            System.out.println("Is usernameField enabled: " + usernameField.isEnabled());
//
//            System.out.println("Is passwordField displayed: " + passwordField.isDisplayed());
//            System.out.println("Is passwordField enabled: " + passwordField.isEnabled());
//
//            System.out.println("Is emailLabel displayed: " + emailLabel.isDisplayed());
//            System.out.println("Is emailLabel enabled: " + emailLabel.isEnabled());
//
//            assertTrue(usernameField.isDisplayed());
//            assertTrue(passwordField.isDisplayed());
//            assertTrue(emailLabel.isDisplayed());
//
//            assertTrue(usernameField.isEnabled());
//            assertFalse(passwordField.isEnabled()) ;
//
//        }



        @AfterMethod
        public void afterTest() {
            driver.close();
            driver.quit();

        }
    }