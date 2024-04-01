package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(xpath = "(//a[@href='/hotels']//p)[2]")
    private WebElement hotels;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnHotels() {
		hotels.click();
	}
}
