package amfam.qa.test.car;

import org.testng.annotations.Test;

import base.BaseClass;
import objects.ZipCodePage2;

public class CarTest extends BaseClass {
	
	@Test
	public void carTest() {
		landingPage.clickCar(allActions);
		zipCodePage1.inputZipCode(allActions, "11416");
		zipCodePage1.clickonStartQuot(allActions);
		getQuatoPage.clickOnGetQuato(allActions);
		zipCodePage2.inputZipCode1(allActions, "11416");
		zipCodePage2.selectByindex();
		zipCodePage2.clickonQuoto(allActions);
	}

}
