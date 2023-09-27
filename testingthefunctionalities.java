package testscripts;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ajioproject.Cartpageuiandactions;
import ajioproject.Crocspageuiandactions;
import ajioproject.cancellationpageuiandactions;
import ajioproject.homepageuiandactions;
import ajioproject.loginpageuiandactions;
import ajioproject.shoespageuiandactions;

public class testingthefunctionalities {
	WebDriver wd;

	@BeforeMethod
	public void openbrowser() {
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.ajio.com/");
	}

	@Test
	public void loginandlogout() throws Exception {

		Thread.sleep(3000);
		loginpageuiandactions loginpage = PageFactory.initElements(wd, loginpageuiandactions.class);

		collectscrnshot("1-LOGIN PAGE");
		loginpage.Signinbutton();
		Thread.sleep(2000);

		collectscrnshot("2-AFTER CLICKING SIGNIN BTN");
		loginpage.Entermobilenumber();
		Thread.sleep(2000);

		collectscrnshot("3-AFTER ENTERING MOBILE NO");
		loginpage.Clickcontinuebutton();
		Thread.sleep(30000);

		collectscrnshot("4-AFTER ENTERING OTP");
		loginpage.Clickstartshoppingbutton();
		Thread.sleep(5000);

		homepageuiandactions homepage = PageFactory.initElements(wd, homepageuiandactions.class);
		Thread.sleep(5000);

		collectscrnshot("5-HOME PAGE");
		homepage.enterdatainsearchfield();
		Thread.sleep(2000);

		collectscrnshot("6-AFTER ENTERING PRODUCT NAME");
		homepage.clicksearchbutton();
		Thread.sleep(2000);

		shoespageuiandactions shoepage = PageFactory.initElements(wd, shoespageuiandactions.class);
		Thread.sleep(2000);

		collectscrnshot("7-SHOE PAGE");
		shoepage.clickmensfilterbutton();
		Thread.sleep(2000);

		collectscrnshot("8-AFTER CLICKING MEN'S FILTER");
		Actions act = new Actions(wd);
		act.scrollByAmount(0, 100).perform();
		Thread.sleep(2000);

		shoepage.clickoncrocs();
		Thread.sleep(2000);

		Set<String> wh = wd.getWindowHandles();
		List<String> list = new ArrayList<String>(wh);

		wd.switchTo().window(list.get(1));
		Thread.sleep(2000);

		act.scrollByAmount(0, 100).perform();
		Thread.sleep(2000);

		collectscrnshot("9-AFTER SWITCHING TO CROCS WINDOW");
		Crocspageuiandactions crocspage = PageFactory.initElements(wd, Crocspageuiandactions.class);
		Thread.sleep(2000);

		crocspage.clicksizebutton();
		Thread.sleep(2000);

		collectscrnshot("10-AFTER CLICKING SIZE BUTTON");
		crocspage.clickwishlistbutton();
		Thread.sleep(3000);

		collectscrnshot("11-AFTER CLICKING WISHLIST BUTTON");
		crocspage.clickproceedtobagbutton();
		Thread.sleep(2000);

		Cartpageuiandactions cartpage = PageFactory.initElements(wd, Cartpageuiandactions.class);
		Thread.sleep(2000);

		collectscrnshot("12-CART PAGE");
		act.scrollByAmount(0, 100).perform();
		Thread.sleep(2000);
		cartpage.clickcouponbutton();
		Thread.sleep(2000);

		collectscrnshot("13-AFTER CLICKING COUPON BUTTON");
		cartpage.clickapplybutton();
		Thread.sleep(2000);

		collectscrnshot("14-AFTER CLICKING APPLY BUTTON");
		cartpage.clickproceedtoshippingbutton();
		Thread.sleep(2000);

		collectscrnshot("15-AFTER CLICKING PROCEED TO SHIPPING BUTTON");
		cartpage.clickproceedtopaymentbutton();
		Thread.sleep(5000);

		collectscrnshot("16-AFTER CLICKING PROCEED TO PAYMENT BUTTON");
		act.scrollByAmount(0, 100).perform();
		Thread.sleep(2000);

		cartpage.clickcashondeliverybutton();
		Thread.sleep(2000);

		collectscrnshot("17-AFTER CLICKING CASH ON DELIVERY BUTTON");
		cartpage.clickplaceorderbutton();
		Thread.sleep(2000);

		collectscrnshot("18-AFTER CLICKING PLACE ORDER BUTTON");
		cartpage.clickconfirmorderbutton();
		Thread.sleep(2000);

		cancellationpageuiandactions cancelpage = PageFactory.initElements(wd, cancellationpageuiandactions.class);
		Thread.sleep(2000);

		collectscrnshot("19-ORDER SUMMARY PAGE");
		cancelpage.clickmyaccountbutton();
		Thread.sleep(2000);

		collectscrnshot("20-AFTER CLICKING MY ACCOUNT BUTTON");
		cancelpage.clickconfirmedorder();
		Thread.sleep(2000);

		collectscrnshot("21-AFTER CLICKING THE ORDER BUTTON");
		cancelpage.clickcancelitembutton();
		Thread.sleep(2000);

		collectscrnshot("22-AFTER CLICKING CANCEL ITEM BUTTON");
		cancelpage.clickyesimsurebutton();
		Thread.sleep(2000);

		collectscrnshot("23-AFTER CLICKING YES I'M SURE BUTTON");
		cancelpage.clickselectoptionsbutton();
		Thread.sleep(2000);

		collectscrnshot("24-AFTER CLICKING SELECT OPTIONS BUTTON");
		cancelpage.clickcancelitem1button();
		Thread.sleep(2000);

		collectscrnshot("25-AFTER CLICKING CANCEL ITEM BUTTON");
		cancelpage.clicksignoutbutton();
		Thread.sleep(5000);

		collectscrnshot("26-AFTER CLICKING SIGN OUT BUTTON");
		Thread.sleep(2000);
		wd.quit();

	}

	public void collectscrnshot(String name) throws IOException {

		try {
			Robot rb = new Robot();
			Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage image = rb.createScreenCapture(capture);
			ImageIO.write(image, "jpg", new File("D:\\SELENIUM\\AJIO PRODUCT BUYING AND CANCELLING\\" + name + ".jpg"));
		} catch (AWTException e) {

			e.printStackTrace();
		}

	}

}
