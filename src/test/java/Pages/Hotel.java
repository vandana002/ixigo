package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel {
	 @FindBy(xpath = "//input[@placeholder='Enter Destination']")
	    private WebElement destination;

	public Hotel(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnDestination() {
		destination.clear();
		destination.click();
	}
	
	
	public void enterdest(String des) {
		// TODO Auto-generated method stub
		destination.clear();
		destination.sendKeys(des);
		destination.sendKeys(Keys.RETURN);
	}
	@FindBy(xpath="//p[@class=\"body-md overflow-hidden truncate whitespace-nowrap text-primary\" and text()=\"Hyderabad\"]")
	private WebElement clickDest;
	public void clickOnDest() {
		clickDest.click();
		
	}
}
