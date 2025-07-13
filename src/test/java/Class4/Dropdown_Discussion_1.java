package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Discussion_1 {
    /**
     * Dropdown
     *      -> It is an element with select-tag in the dom
     *      -> All the values of dropdown (or within select-tag) are always going to be with option-tag
     *      -> To automate dropdown, we use Select-Class (from Selenium)
     *
     *      option-tag:
     *          -> option may have value-attribute or text-value
     *          -> user will on the website either the data of value-attribute or text-value of option-tag
     *
     *      Steps to interact with dropdown:
     *      1. find the locator for dropdown (or select-tag)
     *      2. using locator, find the dropdown webElement
     *      3. Create an object of Select-Class and input the dropdown webElement
     *      4. To select the desired value from dropdown:
     *          if you want to the use the Text-Value of option-tag
     *              use selectByVisibleText()-method with Select-Class object, and input the exact Text-Value
     *          if you want to the use the Value-attribute's Value of option-tag
     *              use selectByValue()-method with Select-Class object, and input the exact value of Value-attribute
     *
     *
     */

    /**
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Select Feb in Month dropdown
     * 4. Select 10 in Date dropdown
     */
    @Test
    public void selectMonthFromDropdown() throws InterruptedException {
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

        // 3. Select Feb in Month dropdown
        // using id-attribute ("month")
        By monthDropdownLocator = By.id("month");
        WebElement monthDropdownElement = driver.findElement(monthDropdownLocator);
        Select monthDropdownObject = new Select(monthDropdownElement);
        monthDropdownObject.selectByValue("2");

        // 4. Select 10 in Date dropdown
        // using id-attribute ("day")
        By dateDropdownLocator = By.id("day");
        WebElement dateDropdownElement = driver.findElement(dateDropdownLocator);
        Select dateDropdownObject = new Select(dateDropdownElement);
        dateDropdownObject.selectByVisibleText("10");


    }
}
