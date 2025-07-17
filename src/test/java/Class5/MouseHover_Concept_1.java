package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseHover_Concept_1 {
    /**
     * How to perform mouse-hover action in automation?
     * --> use the Actions-Class from Selenium
     *
     * Steps to perform a mouseHover action:
     * 1. create the locator for webElement on which we want to move the mouse (or on which we want to perform mouseHover action)
     * 2. find the WebElement using the created locator
     * 3. create an object of Actions-Class and input the driver-variable
     * 4. use moveToElement()-method and input the webElement
     *
     */


    /**
     * 1. Launch https://classroomessentialsonline.com/
     * 2. Move mouse to "Classroom" menu option
     * 3. Click on "Desks & Study Carrels" option
     * 4. Verify "Desks & Study Carrels" heading is displayed
     */
    @Test
    public void mouseHoveSample() throws InterruptedException {
        // 1. Launch https://classroomessentialsonline.com/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.classroomessentialsonline.com");
        // driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Move mouse to "Classroom" menu option
            // 1. create the locator for webElement on which we want to move the mouse
            // xpath -> //span[@title='Classroom']//a
        By classroomMenuLocator = By.xpath("//span[@title='Classroom']//a");
            // 2. find the WebElement using the created locator
        WebElement classroomMenu = driver.findElement(classroomMenuLocator);
            // 3. create an object of Actions-Class and input the driver-variable
        Actions actions = new Actions(driver);
            // 4. use moveToElement()-method and input the webElement
        actions.moveToElement(classroomMenu).build().perform();
        Thread.sleep(5000);

        // 3. Click on "Desks & Study Carrels" option
        // xpath -> //ul[@aria-labelledby='classroom-menu']//a[@title='Desks & Study Carrels']
        By desksStudyCarrelsLocator = By.xpath("//ul[@aria-labelledby='classroom-menu']//a[@title='Desks & Study Carrels']");
        WebElement desksStudyCarrels = driver.findElement(desksStudyCarrelsLocator);
        desksStudyCarrels.click();
        Thread.sleep(5000);

        // 4. Verify "Desks & Study Carrels" heading is displayed
        // xpath -> //h1[text()='Desks & Study Carrels']
        By desksStudyCarrelsPageHeadingLocator = By.xpath("//h1[text()='Desks & Study Carrels']");
        WebElement desksStudyCarrelsPageHeading = driver.findElement(desksStudyCarrelsPageHeadingLocator);
        boolean isDesksStudyCarrelsPageHeadingDisplayed = desksStudyCarrelsPageHeading.isDisplayed();
        Assert.assertTrue(isDesksStudyCarrelsPageHeadingDisplayed, "\"Desks & Study Carrels\" heading is NOT displayed");

        driver.quit();
    }

}
