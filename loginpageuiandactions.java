package ajioproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpageuiandactions {

	@FindBy(how = How.XPATH, using = " //span[@class='  login-form login-modal']")
	WebElement Signinbtn;

	@FindBy(how = How.XPATH, using = " //input[@class='username']")
	WebElement Entermobileno;

	@FindBy(how = How.XPATH, using = " //input[@class='login-btn']")
	WebElement Continuebtn;

	@FindBy(how = How.XPATH, using = " //input[@class='login-form-inputs login-btn']")
	WebElement StartShopping;

	public void Signinbutton() {

		Signinbtn.click();
	}

	public void Entermobilenumber() {

		Entermobileno.sendKeys("8884891568");
		;
	}

	public void Clickcontinuebutton() {

		Continuebtn.click();
	}

	public void Clickstartshoppingbutton() {

		StartShopping.click();
	}

}
