package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
	List<WebElement> submenus;
	
	@FindBy(tagName="h1")
	WebElement verifelem;

	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverOnMenue (String menuname)  {
		try {
			Config.attente(15);
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuname)) {
				
				Config.actions= new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
				
				
				
			}
			
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void cliqueOnProduct(String submenuTitle) {
		try {
		for(WebElement submenu:submenus) {
			if(submenu.getText().contains(submenuTitle)) {
				submenu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verif(String name) {
		Assert.assertEquals(name, verifelem.getText());
	}
	
	
}
