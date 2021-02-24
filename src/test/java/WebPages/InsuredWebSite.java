package WebPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.DriverFactory;
import Utilities.ReportManager;
import WebUtil.WebActions;

public class InsuredWebSite {
	
	// ==========================Objects==================================
		 WebActions webActions = new WebActions();

	// ==========================Locators==================================
		 public static By insuredWebSite = By.xpath("//a[@id='tydeLink']");
		 public static By signIn = By.xpath("//a[text()='Sign In']");
		 public static By guest = By.xpath("//a[text()='Guest']");
		 public static By register = By.xpath("//a[text()='Register']");
		 public static By guestPolicyNumber = By.xpath("//input[@id='guestPolicyNumber']");
		 public static By guestZipCode = By.xpath("//input[@id='guestZipCode']");
		 public static By guestSignInButton = By.xpath("//button[text()='Guest Sign In']");
		 public static By policyPayment = By.xpath("//*[text()='Policy Payment']");
		 public static By signOut = By.xpath("//span[@id='logoutLinkContent']");
		 public static By clientID = By.xpath("//input[@id='clientId']");
		 public static By policyNumber = By.xpath("//input[@id='policyNumber']");
		 public static By zip = By.xpath("//input[@id='zipCode']");
		 public static By next = By.xpath("//button[text()='Next']");
		 public static By openClaim = By.xpath("//a[contains(text(),'Open a claim')]");
		 
	


	/**
	 * =============================================================================
	 * Method: guestSignInAndSignOut | Author: Sunil | Date:27 jan 2021 | Description:
	 * signing In as guest and signing out | Parameters: none | Return: None
	 * =============================================================================
	 * @throws InterruptedException 
	 * @throws IOException 
	 * 
	 * @throws Exception
	 */		

   
	public void guestSignInAndSignOut() throws InterruptedException, IOException {
		
		webActions.Click(insuredWebSite, "click on insured Web Site");
		Thread.sleep(3000);
		webActions.Click(guest, "click on guests");
		webActions.sendKeys(guestPolicyNumber, "09900003346900");
		webActions.sendKeys(guestZipCode, "33702");
		Thread.sleep(2000);
		webActions.Click(guestSignInButton, "click on guest Sign in");
		webActions.waitForVisible(policyPayment);
		Thread.sleep(10000);
		ReportManager.logScreenshotInfo();
		webActions.Click(signOut, "sign Out");
		
	}
	

	/**
	 * =============================================================================
	 * Method: policyOverViewOpenClaim | Author: Sunil | Date:5th Feb 2021 | Description:
	 * signing In as guest and clicking on open Claim tab | Parameters: none | Return: None
	 * =============================================================================
	 * @throws InterruptedException 
	 * @throws IOException 
	 * 
	 * @throws Exception
	 */		
	
	public void policyOverViewOpenClaim() throws Exception{
		
		webActions.Click(insuredWebSite, "click on insured Web Site");
		Thread.sleep(3000);
		webActions.Click(guest, "click on guests");
		webActions.sendKeys(guestPolicyNumber, "4211516006480");
		webActions.sendKeys(guestZipCode, "78654");
		Thread.sleep(2000);
		webActions.Click(guestSignInButton, "click on guest Sign in");
		ReportManager.logScreenshotInfo();
		webActions.waitForVisible(openClaim);
		webActions.Click(openClaim, "Open a Claim");
		Thread.sleep(2000);
		ReportManager.logScreenshotInfo();
		
		
		
		
	}
	

	/**
	 * =============================================================================
	 * Method: registerInsuredWebSite | Author: Sunil | Date:5th Feb 2021 | Description:
	 * signing In as guest and signing out | Parameters: none | Return: None
	 * =============================================================================
	 * @throws InterruptedException 
	 * @throws IOException 
	 * 
	 * @throws Exception
	 */		

	public void registerInsuredWebSite() throws Exception {
		
		
		webActions.Click(insuredWebSite, "click on insured Web Site");
		Thread.sleep(3000);
		webActions.Click(register, "Register");
		webActions.sendKeys(policyNumber, "353535");
		webActions.sendKeys(clientID, "408142");
		webActions.sendKeys(zip, "33702");
		webActions.Click(next, "Next");
		Thread.sleep(100000);
		
		
		
	}
	
		
}
