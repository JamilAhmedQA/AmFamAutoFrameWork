package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.AllActions;

public class GetQuatoPage {
	
	public GetQuatoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Get a Quote']")
	WebElement getQuatoElement;
	
	public void clickOnGetQuato(AllActions allActions) {
		allActions.click(getQuatoElement);
		
	}

}
