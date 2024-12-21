package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageStepDef {
	@Given("utilisateur est sur la page dacceuil")
	public void utilisateur_est_sur_la_page_dacceuil() throws Exception {
	    Config.driver= new ChromeDriver();
	    Config.maximazeWindow();
	    Config.driver.get(Utils.getproprety("Web_Home_Link"));
	}

	@When("utilisateur survole la souris sur le menu {string} et clique sur le submenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_clique_sur_le_submenu(String menuname, String submenuTitle) throws Exception {
	    HomePage page = new HomePage();
	    page.mouseHoverOnMenue(menuname);
	    page.cliqueOnProduct(submenuTitle);
	}

	@Then("utilisateur est didiger vers la page {string}")
	public void utilisateur_est_didiger_vers_la_page(String name) {
		HomePage page = new HomePage();
		page.verif(name);
		
	   
	}

	

}
