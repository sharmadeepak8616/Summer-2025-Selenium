package Class6;

import com.google.common.base.Function;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Wait_Concept_1 {
    /**
     * Timeout: Maximum time driver is going to wait
     * Polling Period: Time after which driver will check,
     *                      if it should move ahead in the code or continue waiting.
     */

    /**
     * Types of Wait in Selenium:
     *  1. Implicit Wait
     *  2. Explicit Wait
     *  3. Fluent Wait
     */

    /**
     * 1. Implicit Wait
     * - this can be useful when we want to wait while finding a webElement
     * - It's like one time setting in driver; means once the Implicit Wait is set in the driver,
     *          from then if we use that driver to find a webElement, it's going to wait if needed.
     * - Polling Period: 250ms (and it's not changeable)
     * - During wait time, driver does not throw NoSuchElement exception
     *      if the element is found within timeout-duration, driver will move ahead in the code
     *      if the element is NOT found within timeout-duration, driver will fail the testcase with NoSuchElement Exception
     *
     */
    @Test
    public void implicitWaitSample() throws InterruptedException {
        // 1. Launch https://facebook.com/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        /*
            Implemented Implicit Wait
            Polling Period: 250ms
            Timeout: 30seconds
         */
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("abcd")).click();
    }

    @Test
    public void verifyGenderRadioButtons() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com");

        // 2. Click on Create new account button
        By createNewAccountBtnLocator = By.xpath("//a[starts-with(@data-testid, 'open-reg')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();

        // 3. Verify Female radio button is NOT selected
        // xpath -> //label[text()='Female']//input
        By femaleGenderBtnLocator = By.xpath("//label[text()='ABCD']//input");
        WebElement femaleRadioBtn = driver.findElement(femaleGenderBtnLocator);
        femaleRadioBtn.click();
        driver.quit();
    }

    /**
     * 2. Explicit Wait
     * - this can be useful to wait for situations other than findElement
     * - Polling Period: 500ms (and it's not changeable)
     * - is defined in WebDriverWait-Class
     * - user has to provide the condition(s) for which driver-should wait.
     *      if the condition(s) is met within timeout, driver will move ahead in the code.
     *      if the condition(s) is NOT met within timeout, driver will fail the testcase with Timeout Exception
     *
     *
     */
    @Test
    public void explicitWaitSample() {
        // 1. Launch https://facebook.com/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // 2. Click on Create new account button
        By createNewAccountBtnLocator = By.xpath("//a[starts-with(@data-testid, 'open-reg')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();

        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        /*
            Create an object of WebDriverWait-Class, which will wait maximum for 60-seconds
         */
        By femaleGenderBtnLocator = By.xpath("//label[text()='Female']//input");
        WebElement femaleRadioBtn = driver.findElement(femaleGenderBtnLocator);
        eWait.until(ExpectedConditions.elementToBeSelected(femaleRadioBtn));
        Assert.assertTrue(femaleRadioBtn.isSelected(), "Female radio button is NOT selected");

    }

    /**
     * 3. Fluent Wait
     * - this can be used as Implicit Wait or Explicit Wait
     * - we can define:
     *      Polling Period
     *      ignore other exceptions while wait
     *      put a custom error when fluent wait's timeout is complete.
     *
     */
    @Test
    public void fluentWaitSample1() {
        // 1. Launch https://facebook.com/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // 2. Click on Create new account button
        By createNewAccountBtnLocator = By.xpath("//a[starts-with(@data-testid, 'open-reg')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();

        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(100))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoAlertPresentException.class)
                .withMessage("Element is NOT found OR Condition didn't complete within 100-seconds");

        // using Fluent-Wait as Explicit Wait
        By femaleGenderBtnLocator = By.xpath("//label[text()='Female']//input");
        WebElement femaleRadioBtn = driver.findElement(femaleGenderBtnLocator);
        fWait.until(ExpectedConditions.elementToBeSelected(femaleRadioBtn));
        Assert.assertTrue(femaleRadioBtn.isSelected(), "Female radio button is NOT selected");
    }

    @Test
    public void fluentWaitSample2() throws InterruptedException {
        // 1. Launch https://facebook.com/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(100))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is NOT found OR Condition didn't complete within 100-seconds");

        // using Fluent-wait as Implicit-Wait
        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("email"));
            }
        });
        // WebElement element = driver.findElement(By.id("email"));
        element.sendKeys("hello123");
        Thread.sleep(5000);
    }

}
