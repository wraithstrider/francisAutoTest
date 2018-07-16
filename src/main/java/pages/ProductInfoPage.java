package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage extends BasePage{

	public ProductInfoPage(WebDriver driver) {
		super(driver);
	}
	
	By productPrice = By.cssSelector(".price-display");

	public WebElement getProductPrice() {
		return driver.findElement(productPrice);
	}
	
	//Methods
	public String returnProductPrice() {
		return getProductPrice().getText();
	}
	
}
