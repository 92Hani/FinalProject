package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeGraniteChipsPage extends BasePage {
    public AwesomeGraniteChipsPage(WebDriver driver){
    super(driver);
    }

    By ClickOnAwesomeGraniteChips = By.className("card-link");

    public void ClickOnAwesomeGraniteChips(){driver.findElement(ClickOnAwesomeGraniteChips).click();}





}
