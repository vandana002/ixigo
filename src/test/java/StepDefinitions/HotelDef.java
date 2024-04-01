package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.EnterDestination;
import Pages.Home;
import Pages.Hotel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelDef {

	WebDriver driver = new ChromeDriver();
	@Given("I am in the homepage")
	public void i_am_in_the_homepage() throws AWTException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		
		Robot robo= new Robot();
		robo.keyPress(KeyEvent.VK_ESCAPE);
		robo.keyRelease(KeyEvent.VK_ESCAPE);
	}

	@When("I click on Hotels")
	public void i_click_on_hotels() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebElement hotel=driver.findElement(By.xpath("(//a[@href='/hotels'])[2]"));
//		hotel.click();
		Home home = new Home(driver);
		home.clickOnHotels();
	}

	@Then("It should display the destination")
	public void it_should_display_the_destination() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,750)");
	}

	@Given("I am in hotel page")
	public void i_am_in_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/hotels");
	}

	@When("I click on destination and it should clear the existing destination")
	public void i_click_on_destination_and_it_should_clear_the_existing_destination() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//WebElement enterDes = driver.findElement(By.xpath("//input[@placeholder='Enter Destination']"));
		//enterDes.clear();
		Hotel des = new Hotel(driver);
		des.clickOnDestination();
	
	}

	@Then("I enter the required destination {string}")
	public void i_enter_the_required_destination(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//WebElement enterDes = driver.findElement(By.xpath("//input[@placeholder='Enter Destination']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		//enterDes.sendKeys("Goa");
		Hotel des1= new Hotel(driver);
		des1.enterdest("Hyderabad");
		//wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		Thread.sleep(5000);
		Hotel ClickOnDest = new Hotel(driver);
		ClickOnDest.clickOnDest();
	}
	@Then("I should click on search")
	public void i_should_click_on_search() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//button[contains(@class,'inline-flex justify-center')]//div[1]"));
		search.click();
	}

	@Given("I am in a showing properties page")
	public void i_am_in_a_showing_properties_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/hotels/search/result?locationId=170&locationName=Hyderabad&locationType=C&masterLocationId=8988&countryId=1&checkinDate=2024-04-01&checkoutDate=2024-04-02&adultCount=2&roomCount=1&childCount=0");
	}

	@When("I click on any hotel")
	public void i_click_on_any_hotel() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(25));
		Thread.sleep(5000);
		WebElement hotelname = driver.findElement(By.xpath("//h3[text()='The Balcony Hotels']"));
		hotelname.click();
		WebElement sc = wait1.until(ExpectedConditions.visibilityOf(hotelname));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,750)");
	}

	@Then("It should redirect to another page and it should show the reviews")
	public void it_should_redirect_to_another_page_and_it_should_show_the_reviews() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I enter the {string}")
	public void i_enter_the(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException(); 
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(25));
		//WebElement enterDest = driver.findElement(By.xpath("//input[@placeholder='Enter Destination']"));
		//enterDest.clear();
		//wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Destination']")));
		Thread.sleep(5000);
		//enterDest.sendKeys("#@Ey");
		EnterDestination obj=new EnterDestination(driver);
		obj.enterDestination("#@Ey");
		
	}
            
	@Then("I should see Oops! No results were found for this keyword. Please modify your search and try again.")
	public void i_should_see_oops_no_results_were_found_for_this_keyword_please_modify_your_search_and_try_again() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException(); 

	}
}
