package Class2;

public class Locators_Concept_1 {
    /**
     * Link to install SelectorHub
     *
     * https://chromewebstore.google.com/detail/selectorshub/ndgimibanhlabgdgjcpbbndiehljcpfh
     */
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
     */
}
