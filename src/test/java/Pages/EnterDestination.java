package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterDestination {
	 

	@FindBy(xpath = "//input[@placeholder='Enter Destination']")
	    private WebElement destination;
	public EnterDestination(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterDestination(String value) {
        destination.clear();
        destination.sendKeys(value);
        destination.sendKeys(Keys.RETURN);
    }




}
