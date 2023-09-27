package ajioproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homepageuiandactions {
	
	@FindBy(how=How.NAME,using = "searchVal")
	WebElement Searchfield;
	
	@FindBy(how=How.XPATH,using = "//span[@class='ic-search']")
	WebElement Searchbtn;
	
	public void enterdatainsearchfield() {
		Searchfield.click();
		Searchfield.sendKeys("Shoes");
	}
	
	public void clicksearchbutton() {
		Searchbtn.click();
	}

}
