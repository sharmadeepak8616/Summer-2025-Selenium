package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators_Practice_2 {
    /**
     * 1. Launch facebook.com
     * 2. Click on Consumer Health Privacy
     * 3. Verify page title starts with "Health Policy"
     * 4. Verify "Privacy Center" heading is displayed
     */
    @Test
    public void verifyHealthPolicyTitle() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Click on Consumer Health Privacy
        // xpath -> //a[@title='Consumer Health Privacy']
        By healthPrivacyLocator = By.xpath("//a[@title='Consumer Health Privacy']");
        WebElement healthPrivacyLink = driver.findElement(healthPrivacyLocator);
        healthPrivacyLink.click();
        Thread.sleep(5000);

        // 3. Verify page title starts with "Health Policy"
        String pageTitle = driver.getTitle();
        boolean isPageTitleCorrect = pageTitle.startsWith("Health Policy");
        Assert.assertTrue(isPageTitleCorrect, "Health Privacy page title does NOT start with 'Health Policy'");

        // 4. Verify "Privacy Center" heading is displayed
        // xpath -> //span[text()='Privacy Center']
        By headingLocator = By.xpath("//span[text()='Privacy Center']");
        WebElement heading = driver.findElement(headingLocator);
        boolean isHeadingDisplayed = heading.isDisplayed();
        Assert.assertTrue(isHeadingDisplayed, "'Privacy Center' heading is NOT displayed");

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
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Click on Create new account button
        // xpath -> //a[starts-with(@data-testid, 'open-reg')]
        By createNewAccountBtnLocator = By.xpath("//a[starts-with(@data-testid, 'open-reg')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();
        Thread.sleep(5000);

        // 3. Verify Female radio button is NOT selected
        // xpath -> //input[@value='1']
        By femaleGenderBtnLocator = By.xpath("//input[@value='1']");
        WebElement femaleRadioBtn = driver.findElement(femaleGenderBtnLocator);
        boolean isFemaleRadioBtnSelected = femaleRadioBtn.isSelected();
        Assert.assertFalse(isFemaleRadioBtnSelected, "Female radio button is selected");

        // 4. Verify Male radio button is NOT selected
        // xpath -> //input[@value='2']
        By maleGenderBtnLocator = By.xpath("//input[@value='2']");
        WebElement maleRadioBtn = driver.findElement(maleGenderBtnLocator);
        boolean isMaleRadioBtnSelected = maleRadioBtn.isSelected();
        Assert.assertFalse(isMaleRadioBtnSelected, "Male radio button is selected");

        // 5. Verify Not specified radio button is NOT selected
        // xpath -> //input[@value='-1']
        By notSpecifiedGenderBtnLocator = By.xpath("//input[@value='-1']");
        WebElement notSpecifiedRadioBtn = driver.findElement(notSpecifiedGenderBtnLocator);
        boolean isNotSpecifiedRadioBtnSelected = notSpecifiedRadioBtn.isSelected();
        Assert.assertFalse(isNotSpecifiedRadioBtnSelected, "Not Specified radio button is selected");

        driver.quit();
    }

    /**
     * 1. Launch facebook.com
     * 2. Enter "abcd@test.com" as login email
     * 3. Enter "myPassword@123" as login password
     * 4. Click Log in button
     * 5. verify error message is displayed (The password you’ve entered is incorrect.)
     */


    /**
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Verify placeholder in Firstname element is "First name"
     */
    @Test
    public void verifyFirstNamePlaceholder() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Click on Create new account button
        // xpath -> //a[starts-with(@data-testid, 'open-reg')]
        By createNewAccountBtnLocator = By.xpath("//a[starts-with(@data-testid, 'open-reg')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();
        Thread.sleep(5000);

        // 3. Verify placeholder in Firstname element is "First name"
        // xpath -> //input[@name='firstname']//preceding-sibling::div
        By firstnamePlaceholderLocator = By.xpath("//input[@name='firstname']//preceding-sibling::div");
        WebElement firstnamePlaceholder = driver.findElement(firstnamePlaceholderLocator);
        String firstnamePlaceholderData = firstnamePlaceholder.getText();
        Assert.assertEquals(firstnamePlaceholderData, "First name", "Firstname input box placeholder is NOT as expected");

        driver.quit();

    }







}
