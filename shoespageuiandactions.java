package ajioproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class shoespageuiandactions {
	
	@FindBy(how = How.XPATH,using = "//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")
    WebElement Mensfilterbtn;
	
	@FindBy(how = How.XPATH,using = "//div[text()='Unisex Literide Clog']")
    WebElement Crocs;
	
	
	public void clickmensfilterbutton() {
		Mensfilterbtn.click();
	}
	public void clickoncrocs() {
		Crocs.click();
	}
}
