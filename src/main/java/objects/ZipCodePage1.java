package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.AllActions;

public class ZipCodePage1 {
	
	public ZipCodePage1(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(id = "uid_54")
	WebElement inputZipCodeElement;
	@FindBy(xpath = "(//span[@class='LoadingButton__content'])[1]")
	WebElement clickonStartQuotElement;
	
	public void inputZipCode(AllActions allActions, String value) {
		allActions.inputText(inputZipCodeElement, value);
	}
	
	public void clickonStartQuot(AllActions allActions) {
		allActions.click(clickonStartQuotElement);
	}

}
