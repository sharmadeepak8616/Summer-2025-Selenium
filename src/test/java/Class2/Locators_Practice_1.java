package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators_Practice_1 {
    /**
     * TC: Verify login email and password fields are enabled
     * 1. Launch facebook.com
     * 2. Verify login email field is enabled
     * 3. Verify login password field is enabled
     */
    @Test
    public void verifyLoginInputFields() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Verify login email field is enabled
        // id = email
        By loginEmailLocator = By.id("email");
        WebElement loginEmail = driver.findElement(loginEmailLocator);
        boolean isLoginEmailEnabled = loginEmail.isEnabled();
        Assert.assertTrue(isLoginEmailEnabled, "Login email field is NOT enabled");
        /*
            using Assert.assertTrue, we are expecting value of isLoginEmailEnabled to be true.
            In case, it is NOT; then testcase will fail with error message: Login email field is NOT enabled
         */

        // 3. Verify login password field is enabled
        // name = pass
        By loginPwdLocator = By.name("pass");
        WebElement loginPwd = driver.findElement(loginPwdLocator);
        boolean isLoginPwdEnabled = loginPwd.isEnabled();
        Assert.assertTrue(isLoginPwdEnabled, "Login password field is NOT enabled");

        driver.quit();
    }

    /**
     * TC: Enter data in login email and password fields
     * 1. Launch facebook.com
     * 2. Enter "johndoe@test.com" in login email field
     * 3. Enter "john@doe1234" in login password field
     * 4. Click on Log in button
     */
    @Test
    public void enterLoginData() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        // 2. Enter "johndoe@test.com" in login email field
        // id = email
        By loginEmailLocator = By.id("email");
        WebElement loginEmail = driver.findElement(loginEmailLocator);
        loginEmail.sendKeys("johndoe@test.com");

        // 3. Enter "john@doe1234" in login password field
        // name = pass
        By loginPwdLocator = By.name("pass");
        WebElement loginPwd = driver.findElement(loginPwdLocator);
        loginPwd.sendKeys("john@doe1234");

        // 4. Click on Log in button
        // tagName = button
        By loginBtnLocator = By.tagName("button");
        WebElement loginBtn = driver.findElement(loginBtnLocator);
        loginBtn.click();

        Thread.sleep(30000);

        driver.quit();
    }
}
