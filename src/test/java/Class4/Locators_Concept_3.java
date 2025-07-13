package Class4;

public class Locators_Concept_3 {
    /**
     * Locators:
     * In general, Locators can be defined as a route to reach to a particular line in the DOM which is related to the webElement we want to interact with.
     *
     * Technically, Locators can be defined as data of By-datatype
     * By -> a class which has methods to generate locators (based on given info/data) to reach to the desired webElement.
     */
    /**
     * Steps to interact with webElement:
     * 1. Find the unique way to reach to the exact line in the DOM which is linked with the webElement we want to interact.
     * 2. Depending on the unique way from step-1, we use specific method from By-Class to create locator.
     * 3. Use the created locator with findElement()-method to find the webElement
     * 4. Once the webElement is found, interact with it using desired method.
     */

    /**
     * To find a specific webElement using locator
     * method: findElement()
     * return-type: WebElement
     */

    /**
     * Locator Strategies:
     *
     * 1. using id-attribute (id-attribute's value is ALWAYS going to be unique)
     * In selectorHub, check if id-attribute has unique-value -> //*[@id='idValue']
     * By locatorUsingId = By.id("idValue");
     *
     * 2. using name-attribute
     * In selectorHub, check if name-attribute has unique-value -> //*[@name='nameValue']
     * By locatorUsingName = By.name("nameValue");
     *
     * 3. using tagName
     * In selectorHub, check if tagName is unique-value -> //tagName
     * By locatorUsingTagName = By.tagName("tagNameValue");
     *
     * 4. using xpath
     * In selectorHub, checked if created xpath is able to find the webElement -> //xpath-to-webElement
     * By locatorUsingXPath = By.xpath("//xpath-to-webElement");
     *
     */

    /**
     * X-path locator strategies:
     * 1. using attribute-value:
     * In selectorHub, create xpath -> //tagName[@attributeName='attribute value']
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) with value="attribute value"
     * Example: //input[@data-testid='royal-email']
     *
     * 2. using partial attribute-value:
     * In selectorHub, create xpath -> //tagName[contains(@attributeName, 'partial attribute value')]
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) where value contains "partial attribute value"
     * Example: //input[contains(@data-testid,'al-ema')]
     *
     * 3. using text-value:
     * In selectorHub, create xpath -> //tagName[text()='text value']
     * --> Find the tag(tagName) in the dom, which has text-value equals to "text value"
     * Example: //a[text()='Create new account']
     *
     * 4. using partial text-value:
     * In selectorHub, create xpath -> //tagName[contains(text(),'partial text value')]
     * --> Find the tag(tagName) in the dom, which has text-value contains "partial text value"
     * Example: //a[contains(text(),'ew acc')]
     *
     * 5. using starting-portion attribute-value
     * In selectorHub, create xpath -> //tagName[starts-with(@attributeName,'starting-portion attribute value')]
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) and it's value starts-with "starting-portion attribute value"
     * Example: //a[starts-with(@data-testid, 'open-reg')]
     *
     * 6. using starting-portion text-value
     * In selectorHub, create xpath -> //tagName[starts-with(text(),'starting-portion text value')]
     * --> Find the tag(tagName) in the dom, which has text-value and it starts-with "starting-portion text value"
     *
     * 7. using parent/grandParent
     * In there is nothing unique about tag which you want to find,
     *  try to find a unique way to reach its parent or grandParent or any tag in family tree
     * //tag2[@attr21='val21']//tag4
     *
     * find tag4
     *      unique way to find tag4 - no
     *      unique way to find parent of tag4(tag22) - no
     *      unique way to find parent of tag22(tag31) - no
     *      unique way to find parent of tag31(tag3) - yes (there is only 1-tag3 in the dom)
     * //tag3//tag22[@attr22='val22']//tag4
     *
     * 8. using sibling
     * //tag[conditions]/following-sibling::tag[conditions]
     * //tag[conditions]/preceding-sibling::tag[conditions]
     *
     */

    /**
     * Methods to interact with WebElement:
     * isEnabled() - to get if webElement is enabled.
     *               if webElement is enabled, method returns true, otherwise false
     *
     * sendKeys() - to type in a webElement
     *
     * click() - to click a webElement
     *
     * isDisplayed() - to get if webElement is displayed
     *                 if webElement is displayed, method returns true otherwise false
     *
     * isSelected() - to get if webElement is selected
     *                if webElement is selected, method returns true otherwise false
     *
     * getText() - to get the text of the webElement
     */
}
