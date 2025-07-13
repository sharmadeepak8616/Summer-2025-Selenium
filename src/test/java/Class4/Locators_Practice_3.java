package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators_Practice_3 {

    /**
     * 1. Launch facebook.com
     * 2. Click Log in button
     * 3. Verify error message is displayed (The email or mobile number you entered isn’t connected to an account.)
     *
     */
    @Test
    public void verifyEmptyLoginError() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Click Log in button
        // xpath -> //form[@data-testid='royal_login_form']//button
        By loginBtnLocator = By.xpath("//form[@data-testid='royal_login_form']//button");
        WebElement loginBtn = driver.findElement(loginBtnLocator);
        loginBtn.click();
        Thread.sleep(5000);

        // 3. Verify error message is displayed
        // xpath -> //div[starts-with(text(),'The email or mobile number')]
        By errorMsgLocator = By.xpath("//div[starts-with(text(),'The email or mobile number')]");
        WebElement errorMsg = driver.findElement(errorMsgLocator);
        boolean isErrorMsgDisplayed = errorMsg.isDisplayed();
        Assert.assertTrue(isErrorMsgDisplayed, "Empty login error message is NOT displayed");

        driver.quit();

    }

    /**
     * 1. Launch cnn.com/weather
     * 2. Verify current-temp is less than or equals to feels-like-temp
     */
    @Test
    public void verifyCurrentTemp() throws InterruptedException {
        // 1. Launch cnn.com/weather
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cnn.com/weather");
        Thread.sleep(5000);

        // 2. Verify current-temp is less than or equals to feels-like-temp
        // xpath -> //span[contains(@class,'current-temp')]
        By currentTempLocator = By.xpath("//span[contains(@class,'current-temp')]");
        WebElement currentTemp = driver.findElement(currentTempLocator);
        String currentTempStrValue = currentTemp.getText();     // "79"
        int currentTempValue = Integer.parseInt(currentTempStrValue);   // 79

        // xpath -> //span[contains(@class,'current-feels')]
        By feelsLikeTempLocator = By.xpath("//span[contains(@class,'current-feels')]");
        WebElement feelsLikeTemp = driver.findElement(feelsLikeTempLocator);
        String feelsLikeTempStrValue = feelsLikeTemp.getText();     // "83"
        int feelsLikeTempValue = Integer.parseInt(feelsLikeTempStrValue);   // 83

        boolean isCurrentTempLessEqFeelsLike = currentTempValue <= feelsLikeTempValue;
        Assert.assertTrue(isCurrentTempLessEqFeelsLike, "current-temp is NOT less than or equals to feels-like-temp");

        driver.quit();
    }

    /**
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Verify Female radio button is NOT selected
     * 4. Verify Male radio button is NOT selected
     * 5. Verify Not specified radio button is NOT selected
     */
    @Test
    public void verifyGenderRadioButtons() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        // driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Click on Create new account button
        // xpath -> //a[starts-with(@data-testid, 'open-reg')]
        By createNewAccountBtnLocator = By.xpath("//a[starts-with(@data-testid, 'open-reg')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();
        Thread.sleep(5000);

        // 3. Verify Female radio button is NOT selected
        // xpath -> //label[text()='Female']//input
        By femaleGenderBtnLocator = By.xpath("//label[text()='Female']//input");
        WebElement femaleRadioBtn = driver.findElement(femaleGenderBtnLocator);
        boolean isFemaleRadioBtnSelected = femaleRadioBtn.isSelected();
        Assert.assertFalse(isFemaleRadioBtnSelected, "Female radio button is selected");

        // 4. Verify Male radio button is NOT selected
        // xpath -> //label[text()='Male']//input
        By maleGenderBtnLocator = By.xpath("//label[text()='Male']//input");
        WebElement maleRadioBtn = driver.findElement(maleGenderBtnLocator);
        boolean isMaleRadioBtnSelected = maleRadioBtn.isSelected();
        Assert.assertFalse(isMaleRadioBtnSelected, "Male radio button is selected");

        // 5. Verify Not specified radio button is NOT selected
        // xpath -> //label[text()='Not specified']//input
        By notSpecifiedGenderBtnLocator = By.xpath("//label[text()='Not specified']//input");
        WebElement notSpecifiedRadioBtn = driver.findElement(notSpecifiedGenderBtnLocator);
        boolean isNotSpecifiedRadioBtnSelected = notSpecifiedRadioBtn.isSelected();
        Assert.assertFalse(isNotSpecifiedRadioBtnSelected, "Not Specified radio button is selected");

        driver.quit();
    }


}
