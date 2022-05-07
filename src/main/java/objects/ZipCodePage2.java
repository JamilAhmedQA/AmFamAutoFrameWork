package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commons.AllActions;

public class ZipCodePage2 {
	
	public ZipCodePage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='uid_34']")
	WebElement inputZipCodElement1;
	@FindBy(xpath = "//select[@id='uid_37']")
	WebElement dropDownElement;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement clickonQuoto;
	
	public void inputZipCode1(AllActions allActions, String value) {
		allActions.inputText(inputZipCodElement1, value);	
	}
	// is this correct way ??????????????
	public void selectByindex() {
		Select select = new Select(dropDownElement);
		select.selectByIndex(1);
	}
	
	public void clickonQuoto(AllActions actions) {
		actions.click(clickonQuoto);
	}

}
