package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectée {
	
	@FindBy(name="orderby")
	WebElement tri;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List <WebElement> menus;
	
	@FindBy(xpath="//*[@id=\"product-16704\"]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verifProd;

	public MaisonConnectée() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void sortTriAndClickProduct(String sortTri, String productName) {
		Select select =new Select(tri);
		select.selectByVisibleText(sortTri);
		try {
		for(WebElement menu:menus) {
			if(menu.getText().contains(productName)) {
				menu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	public void verifProduct(String titreproduit) {
		Assert.assertEquals(titreproduit, verifProd.getText());
	}
}
