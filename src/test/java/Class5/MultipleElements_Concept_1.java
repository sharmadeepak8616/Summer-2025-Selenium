package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MultipleElements_Concept_1 {
    /**
     * when we want to find multiple webElements using a locator, then we use findElements()-method
     */

    /**
     * How to automate auto-suggestions:
     *  1. Observe if the data that user is seeing is present as an attribute's-value or text-value in the dom
     *  2. Create a locator that find ALL auto-suggestion webElements (or lines in the dom which are auto-suggestions)
     *  3. using findElements()-method, find ALL the auto-suggestion webElements
     *  4. Apply a loop (for-loop) example: [we1, we2, we3, we4, we5]
     *      a) pick a autoSuggestion-Element from the list found in step-3
     *      b) apply getAttribute()-method or getText()-method based on step-1
     *      c) if the above-data is equals to what we want to click
     *          d) click the autoSuggestion-Element
     *          e) break the loop
     *
     */

    /**
     * 1. Launch hotels.com
     * 2. Enter "Tan" in the search input box
     * 3. Select "Zanzibar Tanzania" form auto-suggestion
     */
    @Test
    public void autoSuggestion() throws InterruptedException {
        // 1. Launch hotels.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com/");
        // driver.manage().window().maximize();
        Thread.sleep(5000);

        // 2. Enter "Tan" in the search input box
        By searchBoxLocator = By.xpath("//button[@data-stid='destination_form_field-menu-trigger']");
        driver.findElement(searchBoxLocator).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-stid='destination_form_field-menu-input']")).sendKeys("Tan");
        Thread.sleep(5000);

        // 3. Select "Zanzibar Tanzania" form auto-suggestion
            // 1. Observe if the data that user is seeing is present as an attribute's-value or text-value in the dom
            // it is button-tag with aria-label attribute that has same value as it is displayed to the user
            // 2. Create a locator that find ALL auto-suggestion webElements (or lines in the dom which are auto-suggestions)
        By allAutoSuggestionLocator = By.xpath("//button[@data-stid='destination_form_field-result-item-button']");
            // 3. using findElements()-method, find ALL the auto-suggestion webElements
        List<WebElement> allAutoSuggestionElements = driver.findElements(allAutoSuggestionLocator);

        // 4. Apply a loop (for-loop) example: [we1, we2, we3, we4, we5]
        for (WebElement suggestion : allAutoSuggestionElements) {
            String suggestionText = suggestion.getAttribute("aria-label");
            Assert.assertNotNull(suggestionText);
            if (suggestionText.equals("Zanzibar Tanzania")) {
                suggestion.click();
                break;
            }
        }

    }


    /**
     * How to automate Calendar:
     *  1. Observe if the date-data that user is seeing is present as an attribute's-value or text-value in the dom
     *  2. Create a locator that find ALL date-webElements
     *  3. using findElements()-method, find ALL the date-webElements
     *  4. Apply a loop (for-loop) example: [we1, we2, we3, we4, we5]
     *      a) pick a date-Element from the list found in step-3
     *      b) apply getAttribute()-method or getText()-method based on step-1
     *      c) if the above-data is equals to date we want to click
     *          d) click the date-Element
     *          e) break the loop
     *
     */
    /**
     * 1. Launch hotels.com
     * 2. Click the Dates button
     * 3. Select "August 8" as checkin date
     * 4. Select "August 14" as checkout date
     * 5. Click on Done button
     */
    @Test
    public void calendarSample() throws InterruptedException {
        // 1. Launch hotels.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com/");
        // driver.manage().window().maximize();
        Thread.sleep(10000);

        driver.findElement(By.id("onetrust-close-btn-container")).click();

        Thread.sleep(5000);
        // 2. Click the Dates button
        By dateButtonLocator = By.xpath("//button[@data-testid='uitk-date-selector-input1-default']");
        WebElement dateButton = driver.findElement(dateButtonLocator);
        dateButton.click();
        Thread.sleep(5000);

        // 3. Select "August 8" as checkin date
        By augustDatesLocator = By.xpath("//span[text()='August 2025']//following-sibling::table//div[starts-with(@class,'uitk-date-number')]");
        List<WebElement> augustDates = driver.findElements(augustDatesLocator);
        for (WebElement date : augustDates) {
            String dateValue = date.getText();
            if (dateValue.equals("8")) {
                date.click();
                break;
            }
        }
        Thread.sleep(5000);
        // 4. Select "August 14" as checkout date
        // By augustDatesLocator2 = By.xpath("//span[text()='August 2025']//following-sibling::table//div[starts-with(@class,'uitk-date-number')]");
        List<WebElement> augustDates2 = driver.findElements(augustDatesLocator);
        for (WebElement date : augustDates2) {
            String dateValue = date.getText();
            if (dateValue.equals("14")) {
                date.click();
                break;
            }
        }

        Thread.sleep(5000);
        // 5. Click on Done button
        By dateDoneBtnLocator = By.xpath("//button[@data-stid='apply-date-selector']");
        driver.findElement(dateDoneBtnLocator).click();


    }


}
