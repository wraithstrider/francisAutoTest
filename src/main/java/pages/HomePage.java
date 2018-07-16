package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="searchterm")
	WebElement searchBox;
	
	By searchBox1 = By.id("searchterm");

	public WebElement getSearchBox() {
//		return searchBox;
		return driver.findElement(searchBox1);
	}
	
	//Methods
	public void enterSearchCriteria() {
		getSearchBox().sendKeys("Davidoff Cool Water");
	}
	
	public void clickSearch() {
		getSearchBox().sendKeys(Keys.ENTER);
	}
	
}
