package ajioproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Crocspageuiandactions {

	@FindBy(how = How.XPATH, using = "//span[text()='6']")
	WebElement sizebtn;

	@FindBy(how = How.XPATH, using = "//div[@class='btn-gold']")
	WebElement wishlistbtn;

	@FindBy(how = How.XPATH, using = "//div[@class='ic-cart ']")
	WebElement Proceedtobagbtn;

	public void clicksizebutton() {
		sizebtn.click();
	}

	public void clickwishlistbutton() {
		wishlistbtn.click();
	}

	public void clickproceedtobagbutton() {
		Proceedtobagbtn.click();
	}

}
