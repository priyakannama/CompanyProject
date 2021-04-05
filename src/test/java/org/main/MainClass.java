package org.main;

import java.io.IOException;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.LocatorsPath;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainClass extends LibGlobal {


	static LocatorsPath pojo;

	@BeforeSuite
	private void tc1() {
		getDriver();
		
		launchUrl("https://www.liidaveqa.com/");
	}

	@Test
	private void Login() throws IOException, InterruptedException {
		pojo = new LocatorsPath();
		btnClk(pojo.getSignin());
		enterText(pojo.getUserName(), "lenproautomation8@lenqat.com");
		enterText(pojo.getPassWrd(), "Community17");
		btnClk(pojo.getLoginSubmit());
		btnClk(pojo.getIcon());
		if (readExcel(0, 0).equalsIgnoreCase("salestool")) {
			btnClk(pojo.getSalesTool());
		}
		if (readExcel(1, 0).equalsIgnoreCase("BuildAProposal")) {
			btnClk(pojo.getBuildAProposal());
		}
		waitTime();
		btnClk(pojo.getSelectLead());
		waitUntillClickable(pojo.getAddlead());
		btnClk(pojo.getAddlead());
		}

	@Test(dependsOnMethods = "Login")
	private void details() throws IOException, InterruptedException {
		pojo = new LocatorsPath();
		writeExcel(0, 4, "\\src\\test\\resources\\DummyPic.png");
		enterText(pojo.getFirstName(), readExcel(2, 0));
		enterText(pojo.getLastName(), readExcel(3, 0));
		String email = readExcel(4, 0);
		enterText(pojo.getEmail(),email);
		String phonenu = readExcel(5, 0);
		enterText(pojo.getPhonenumber(),phonenu);
		scrolldown(pojo.getUpdate());
		waitvisibleEle(pojo.getCalander());
		String data = readExcel(0, 1);
		btnClk(pojo.getCalander());
		WebElement date = driver.findElement(By.xpath("//a[text()=" +data+ "]"));
		btnClk(date);
		waitTime();
		setValue(readExcel(0, 2), pojo.getTime());
		scrolldown(pojo.getSaveLead());
		btnClk(pojo.getDocument());
		waitTime();
		btnClk(pojo.getDocumentSelect());
	    select(pojo.getDocumentSelect(), "OTHER");
		btnClk(pojo.getDocumentType());
		String path = System.getProperty("user.dir") + readExcel(0, 3);
		pojo.getDocFile().sendKeys(path);
		btnClk(pojo.getAddtolead());
		String path1 = System.getProperty("user.dir") + readExcel(0, 4);
		waitTime();
		pojo.getImgFile().sendKeys(path1);
		btnClk(pojo.getSaveLead());
		waitTime();
		if (pojo.getPopup().isEnabled()) {
			btnClk(pojo.getPopup());
		}
		waitvisibleEle(pojo.getSuccesful());
		Assert.assertTrue(pojo.getSuccesful().getText().contains("Lead has been created/edited successfully."),
				"successful message not displayed");
	}


}
