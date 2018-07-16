package product;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.HomePage;
import pages.ProductInfoPage;
import pages.ResultsPage;

public class SearchProductTest extends BaseTest{
	
	HomePage homePage = new HomePage(driver);
	ResultsPage resultsPage = new ResultsPage(driver);
	ProductInfoPage productInfoPage = new ProductInfoPage(driver);

	@Test
	public void testSearchProduct() {
		String price = "";
		String expectedPrice = "$59.00";
		
		homePage.enterSearchCriteria();
		homePage.clickSearch();
		resultsPage.clickFirstResult();
		price = productInfoPage.returnProductPrice();
		assertEquals(price.trim(), expectedPrice);
	}
}