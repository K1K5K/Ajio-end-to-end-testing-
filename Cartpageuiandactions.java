package ajioproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cartpageuiandactions {
	@FindBy(how = How.ID, using = "SAVE15")
	WebElement coupon;

	@FindBy(how = How.XPATH, using = "//button[@class='rilrtl-button button apply-button ']")
	WebElement couponapplybtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='rilrtl-button button shipping-button']")
	WebElement proceedtoshippingbtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='payment-btn ']")
	WebElement proceedtopaymentbtn;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Cash on Delivery']")
	WebElement cashondeliverybtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='ant-btn custom-pay-btn ant-btn-primary']")
	WebElement placeorderbtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='_1ky70 GL5W5 _2cyL8 _18jhR baCti _3KJzo']")
	WebElement confirmorderbtn;

	public void clickcouponbutton() {
		coupon.click();
	}

	public void clickapplybutton() {
		couponapplybtn.click();
	}
	
	public void clickproceedtoshippingbutton() {
		proceedtoshippingbtn.click();
	}
	
	public void clickproceedtopaymentbutton() {
		proceedtopaymentbtn.click();
	}
	
	public void clickplaceorderbutton() {
		placeorderbtn.click();
	}
	
	public void clickcashondeliverybutton() {
		cashondeliverybtn.click();
	}
	
	public void clickconfirmorderbutton() {
		confirmorderbtn.click();
	}

}
