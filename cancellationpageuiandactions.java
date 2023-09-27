package ajioproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class cancellationpageuiandactions {
	@FindBy(how = How.XPATH, using = "//a[text()='My Account']")
	WebElement myaccountbtn;

	@FindBy(how = How.XPATH, using = "//div[@class='order-status' and text()='Confirmed']")
	WebElement confirmedorder;

	@FindBy(how = How.XPATH, using = "//div[@class='cancel-item cancel-item-position' ]")
	WebElement cancelitembtn;

	@FindBy(how = How.XPATH, using = "//button[@class='rilrtl-button btn-gold' ]")
	WebElement yesimsurebtn;

	@FindBy(how = How.TAG_NAME, using = "select")
	WebElement selectoptionsbtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='rilrtl-button rilrtl-button--primary disabled-false' ]")
	WebElement cancelitem1btn;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Sign Out']")
	WebElement signoutbtn;

	public void clickmyaccountbutton() {
		myaccountbtn.click();
	}

	public void clickconfirmedorder() {
		confirmedorder.click();
	}

	public void clickcancelitembutton() {
		cancelitembtn.click();
	}

	public void clickyesimsurebutton() {
		yesimsurebtn.click();
	}
	
	public void  clickselectoptionsbutton() {
		selectoptionsbtn.sendKeys("Want to change the delivery address");
	}
	
	public void clickcancelitem1button() {
		cancelitem1btn.click();
	}
	
	public void clicksignoutbutton() {
		signoutbtn.click();
	}

}
