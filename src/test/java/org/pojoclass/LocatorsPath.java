package org.pojoclass;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsPath extends LibGlobal {
	

	
	public LocatorsPath() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=\"Sign In\"]")
	private WebElement signin;
	@FindBy(id="j_username")
	private WebElement userName;
	@FindBy(id="j_password")
	private WebElement passWrd;
	@FindBy(id="loginSubmit")
	private WebElement loginSubmit;
	@FindBy(xpath="//i[@class=\"far fa-bars v2-hamburger-menu\"]")
	private  WebElement icon;
	@FindBy(xpath="//a[text()=\"Sales Tools\"]")
	private  WebElement salesTool;
	@FindBy(xpath="//a[text()=\"Build a Proposal\"]")
	private  WebElement buildAProposal;
	@FindBy(xpath="//a[text()=\"SELECT LEAD\"]")
	private  WebElement selectLead;
	@FindBy(xpath="//a[@class=\"btn btn-primary hide-mobile introjs-l-9 introjs-l-83\"]")
	private  WebElement addlead;
	@FindBy(id="firstName")
	private WebElement firstName;
	@FindBy(id="lastName")
	private WebElement lastName;
	@FindBy(xpath="//a[text()=\"28\"]")
	private WebElement dateselected;
	@FindBy(xpath="//div[text()=\"Uploads\"]")
	private WebElement update;
	@FindBy(id="phNo")
	private WebElement phonenumber;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(xpath="//input[@id=\"calender1\"]")
	private WebElement calander;
	@FindBy(xpath="//p[text()=\"Add Document\"]")
	private WebElement document;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCalander() {
		return calander;
	}
	
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getAddlead() {
		return addlead;
	}
	public WebElement getSelectLead() {
		return selectLead;
	}
	public WebElement getIcon() {
		return icon;
	}
	public WebElement getSalesTool() {
		return salesTool;
	}
	public WebElement getBuildAProposal() {
		return buildAProposal;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getDocumentType() {
		return documentType;
	}
	public WebElement getPassWrd() {
		return passWrd;
	}
	
	public WebElement getDocument() {
		return document;
		
	}
	@FindBy(xpath="(//option[text()=\"OTHER\"])[2]")
	private WebElement documentType;
	@FindBy(xpath="//select[@data-msg-required=\"Please select a type\" and @data-rule-required =\"true\"]")
    private WebElement DocumentSelect;
	public WebElement getDocumentSelect() {
		return DocumentSelect;
	}
	@FindBy(xpath="//span[text()=\"Add To Lead\"]")
	private WebElement addtolead;
	public WebElement getAddtolead() {
		return addtolead;
	}
	@FindBy(xpath="//input[@name=\"documentFiles[1]\"]")
	private WebElement selectFile;
	public WebElement getSelectFile() {
		return selectFile;
	}
	@FindBy(xpath="//select[@id=\"scheduleRequestTime\"]")
	private WebElement Time;
	public WebElement getTime() {
		return Time;
	}
	@FindBy(id="multipleFileSelect-1")
	private WebElement docFile;
	public WebElement getDocFile() {
		return docFile;
	}
	@FindBy(id="multipleImageSelect[0]")
	private WebElement imgFile;
	public WebElement getImgFile() {
		return imgFile;
	}
	@FindBy(xpath="//span[text()=\"SAVE LEAD\"]")
	private WebElement saveLead;
	public WebElement getSaveLead() {
		return saveLead;
	}
	@FindBy(xpath="//li[contains(text(),'Lead has been created/edited successfully')]")
	private WebElement succesful;
	public WebElement getSuccesful() {
		return succesful;
	}
	@FindBy(xpath="//button[text()=\"Create Duplicate\"]")
	private WebElement popup;
	public WebElement getPopup() {
		return popup;
	}
	public WebElement getLoginSubmit() {
		return loginSubmit;
	}
	public WebElement getDateselected() {
		return dateselected;
	}
	public WebElement getUpdate() {
		return update;
	}



}
