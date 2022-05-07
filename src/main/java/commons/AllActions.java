package commons;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import base.BaseClass;

public class AllActions {

	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Reporter.log("element is clicking" + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("element is unable to click" + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}

	public void inputText(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
			Reporter.log(text + " :we passed this value" + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("element is not found " + element + "<br>");
			Assert.fail();
		}

	}

}
