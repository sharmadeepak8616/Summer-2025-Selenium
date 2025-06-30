package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework1 {
    /**
     * TC: Verify the facebook title starts with "f" (ignoring cases)
     * 1. Launch facebook.com
     * 2. Verify the page-title on facebook.com starts with "f" (ignoring cases)
     */
    @Test
    public void verifyPageTitleStartsWith() throws InterruptedException {
        // 1. Launch facebook.com (https://www.facebook.com)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Verify the page-title on facebook.com starts with "f" (ignoring cases)
        String expectedStartsWith = "f";
        String actualPageTitle = driver.getTitle();
        // startsWith() from String-Class
        // boolean result = actualPageTitle.toLowerCase().startsWith(expectedStartsWith.toLowerCase());
        String expectedStartsWith_Lowercase = expectedStartsWith.toLowerCase();
        String actualPageTitle_Lowercase = actualPageTitle.toLowerCase();
        boolean result = actualPageTitle_Lowercase.startsWith(expectedStartsWith_Lowercase);

        Assert.assertTrue(result, "Page-title on facebook.com does NOT start with \""+expectedStartsWith+"\" (ignoring cases)");

        driver.quit();
    }

    /**
     * TC: Verify the current url contains "BoOk" (ignoring cases)
     * 1. Launch facebook.com
     * 2. Verify the current-url contains "BoOk" (ignoring cases)
     */

}
