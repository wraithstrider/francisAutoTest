package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends BasePage{

	public ResultsPage(WebDriver driver) {
		super(driver);
	}
	
	By firstProduct = By.cssSelector(".sli_content > div > h4 > a");

	public WebElement getFirstResult() {
		return driver.findElement(firstProduct);
	}
	
	//Methods
	public void clickFirstResult() {
		getFirstResult().click();
	}
	
}
