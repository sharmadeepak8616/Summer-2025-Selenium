package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Basic {

    /**
     * Methods:
     *      get() - to launch an url on webpage
     *      maximize() - to maximize the webpage
     *      close() - to close the browser-window which is connected with driver-variable (even if multiple browser-windows are opened due to automation code)
     *      quit() - to close ALL windows which are opened due to automation code.
     *      getTitle() - to get the title of browser-window which is connected with driver-variable
     *      getCurrentUrl() - to get the url of browser-window which is connected with driver-variable
     */

    @Test
    public void launchAmazon() throws InterruptedException {
        // Launch amazon.com
        /*
            1. launch an empty browser window
            2. open amazon.com on that window
         */
        // 1. Select the location of ChromeDriver
        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        /**
         *  Above 2-lines of code are responsible to create an empty chrome-window
         *  And, driver-variable is connected with the above created chrome-window.
         *  Therefore, using the driver-variable whatever we'll execute,
         *      it will be performed on the connected Chrome-window
         */

        /**
         * To launch a webpage
         * method: get()
         */
        driver.get("https://www.amazon.com/");

        Thread.sleep(7000); // to pause the execution for 7000milliseconds (7-seconds)

        /**
         * To maximize the window
         * method: maximize()
         */
        driver.manage().window().maximize();

        Thread.sleep(7000); // to pause the execution for 7000milliseconds (7-seconds)

        /**
         * To close the browser-webpages (opened due to automation code)
         * method: close()
         *      will ONLY close the webpage, which is currently connected with the driver-variable
         *      even if there are multiple browser-windows opened due to automation-code.
         *
         * method: quit()
         *      will close ALL the browser-windows which are opened due to automation-code.
         */
        driver.quit();
    }

    /**
     * TC: Verify correct page-title is present on facebook.com
     * 1. Launch facebook.com (https://www.facebook.com)
     * 2. Verify page title on facebook.com is "Welcome to facebook"
     * 3. Verify the url on browser-window is "https://www.facebook.com/"
     */
    @Test
    public void verifyFbPageTitle() throws InterruptedException {
        // 1. Launch facebook.com (https://www.facebook.com)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Verify page title on facebook.com is "Welcome to facebook"
        String expectedPageTitle = "Facebook - log in or sign up";
        /**
         * To get page-title of browser-window which is connected with driver-variable
         * method: getTitle()
         * return-type: String
         */
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Page title is NOT as expected");
        Thread.sleep(5000);
        // 3. Verify the url on browser-window is "https://www.facebook.com/"
        /**
         * To get current-url on browser-window which is connected with driver-variable
         * method: getCurrentUrl()
         * return-type: String
         */
        String expectedCurrentUrl = "https://www.facebook.com/";
        String actualCurrentUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualCurrentUrl, expectedCurrentUrl, "Current-url is NOT as expected");
        Thread.sleep(5000);
        driver.quit();
    }

}
