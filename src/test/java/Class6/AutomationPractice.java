package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationPractice {
    /**
     * 1. Launch hotels.com
     * 2. Select Adults as 4
     * 3. Select Children as 2
     * 4. Verify Total travellers count is number of adults and children
     */
    @Test
    public void hotelsPractice() throws InterruptedException {
        // 1. Launch hotels.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.hotels.com");

        // 2. Select Adults as 5
        int expectedAdultCount = 5;
        By openRoomPickerLocator = By.xpath("//button[@data-stid='open-room-picker']");
        driver.findElement(openRoomPickerLocator).click();
        By adultsCountLocator = By.xpath("//input[@aria-label='Adults']");
        By adultsCountPlusBtnLocator = By.xpath("//input[@aria-label='Adults']/following-sibling::button");
        By adultsCountMinusBtnLocator = By.xpath("//input[@aria-label='Adults']/preceding-sibling::button");
        for (int i=0 ; i<=20 ; i++) {
            int currentAdultCount = Integer.parseInt(driver.findElement(adultsCountLocator).getAttribute("value"));
            if (currentAdultCount < expectedAdultCount) {
                driver.findElement(adultsCountPlusBtnLocator).click();
            } else if (currentAdultCount > expectedAdultCount) {
                driver.findElement(adultsCountMinusBtnLocator).click();
            } else {
                break;
            }
        }


    }
}
