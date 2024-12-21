package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.MaisonConnectée;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MaisonConnecteeStepDef {
	
	@Given("utilisateur est sur la page maison connecte")
	public void utilisateur_est_sur_la_page_maison_connecte() throws Exception {
	    
		Config.driver= new ChromeDriver();
		Config.maximazeWindow();
		Config.driver.get(Utils.getproprety("Web_MaisonConnect_Link"));
	}

	@When("utilisateur effectuer un tri {string} et cliquer sur un produit {string}")
	public void utilisateur_effectuer_un_tri_et_cliquer_sur_un_produit(String sortTri, String productName) {
		
		MaisonConnectée maison= new MaisonConnectée();
		maison.sortTriAndClickProduct(sortTri, productName);
	   
	}

	@Then("utilisateur est dirigee ver la page de produit {string}")
	public void utilisateur_est_dirigee_ver_la_page_de_produit(String titreproduit) {
		
		MaisonConnectée maison= new MaisonConnectée();
		maison.verifProduct(titreproduit);
	}

}
