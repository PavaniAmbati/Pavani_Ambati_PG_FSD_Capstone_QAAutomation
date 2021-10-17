package com.simplilearn.worshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerTests {
	
	@Test 
	public void negativeLoginTest() {
		
		System.out.println("Starting incorrectUsernameTest");
		//create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//open test page
		String url = "http://localhost:4200/customerlogin";
		driver.get(url);
		System.out.println("Page is Opened");
		
		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("pavani");
		sleep(2000);
		// enter password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("passwords");
		sleep(2000);
		// click login button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		WebElement errorMessage = driver.findElement(By.id("flash"));
		String expectedErrorMessage = "Invalid Credentials. Try again.";
		String actualErrorMessage = errorMessage.getText();
		
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual message does not contain expected message. \n Actual Message:" + actualErrorMessage + "\n Expected Message:"  
		+ expectedErrorMessage);
		
		sleep (2000);
		
		//close browser
		driver.quit();
	}
	
	
	@Test 
	public void positiveLoginTest() {
		
		System.out.println("Starting correctUsernameTest");
		//create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//open test page
		String url = "http://localhost:4200/customerlogin";
		driver.get(url);
		System.out.println("Page is Opened");
		
		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("pavani");
		sleep(2000);
		// enter password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		sleep(2000);
		// click login button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		sleep(2000);
		
		// verification on new url
		String expectedurl = "http://localhost:4200/customerhome";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl, "Actual page url is not expected");
		
		sleep (2000);
		
		//close browser
		driver.quit();
	}
	
	@Test 
	public void positiveWithdrawalTest() {
		
		System.out.println("Starting money withdrawal test");
		//create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//open test page
		String url = "http://localhost:4200/customerlogin";
		driver.get(url);
		System.out.println("Page is Opened");
		
		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("pavani");
		sleep(2000);
		// enter password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		sleep(2000);
		// click login button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		sleep(2000);
		
		// click accountdetails button
		WebElement accountdetailsButton = driver.findElement(By.id("accountdetailsWM"));
		accountdetailsButton.click();
		sleep(2000);
		
		// click withdrawal button
		WebElement withdrawButton = driver.findElement(By.id("withdrawal"));
		withdrawButton.click();
		sleep(2000);
		
		// enter amount to withdraw 
		WebElement amount = driver.findElement(By.name("withdrawalamount"));
		amount.sendKeys("100");
		sleep(2000);
		
		// click money withdraw button
		WebElement withdrawmoneyButton = driver.findElement(By.id("withdrawmoney"));
		withdrawmoneyButton.click();
		sleep(2000);
		
		//verification
		WebElement successMessage = driver.findElement(By.id("flash"));
		String expectedSuccessMessage = "Transaction successfully completed";
		String actualSuccessMessage = successMessage.getText();
				
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
				"Actual message does not contain expected message. \n Actual Message:" + actualSuccessMessage + "\n Expected Message:"  
						+ expectedSuccessMessage);
		sleep (2000);
		
		//close browser
		driver.quit();
	}
	
	@Test 
	public void positiveDepositTest() {
		
		System.out.println("Starting money deposit test");
		//create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//open test page
		String url = "http://localhost:4200/customerlogin";
		driver.get(url);
		System.out.println("Page is Opened");
		
		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("pavani");
		sleep(2000);
		// enter password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		sleep(2000);
		// click login button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		sleep(2000);
		
		// click accountdetails button
		WebElement accountdetailsButton = driver.findElement(By.id("accountdetailsDM"));
		accountdetailsButton.click();
		sleep(2000);
		
		// click deposit button
		WebElement depositButton = driver.findElement(By.id("deposit"));
		depositButton.click();
		sleep(2000);
		
		// enter amount to deposit 
		WebElement amount = driver.findElement(By.name("depositamount"));
		amount.sendKeys("100");
		sleep(2000);
		
		// click money deposit button
		WebElement depositmoneyButton = driver.findElement(By.id("depositmoney"));
		depositmoneyButton.click();
		sleep(2000);
		
		//verification
		WebElement successMessage = driver.findElement(By.id("flash"));
		String expectedSuccessMessage = "Transaction successfully completed";
		String actualSuccessMessage = successMessage.getText();
				
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
				"Actual message does not contain expected message. \n Actual Message:" + actualSuccessMessage + "\n Expected Message:"  
						+ expectedSuccessMessage);
		sleep (2000);
		
		//close browser
		driver.quit();
	}
	
	@Test 
	public void positiveMoneyTransferTest() {
		
		System.out.println("Starting money transfer test");
		//create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//open test page
		String url = "http://localhost:4200/customerlogin";
		driver.get(url);
		System.out.println("Page is Opened");
		
		// enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("pavani");
		sleep(2000);
		// enter password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		sleep(2000);
		// click login button
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		sleep(2000);
		
		// click accountdetails button
		WebElement accountdetailsButton = driver.findElement(By.id("accountdetailsMT"));
		accountdetailsButton.click();
		sleep(2000);
		
		// click money transfer button
		WebElement moneytransferButton = driver.findElement(By.id("moneytransfer"));
		moneytransferButton.click();
		sleep(2000);
		
		// enter account number to which money should be transferred
		WebElement accountnumber = driver.findElement(By.name("accountnumber"));
		accountnumber.sendKeys("C44554455765");
		sleep(2000);
		
		// enter amount to be transferred 
		WebElement amount = driver.findElement(By.name("transferamount"));
		amount.sendKeys("100");
		sleep(2000);
		
		// click money deposit button
		WebElement depositmoneyButton = driver.findElement(By.id("transfermoney"));
		depositmoneyButton.click();
		//sleep(2000);
		
		//verification
		WebElement successMessage = driver.findElement(By.id("flash"));
		String expectedSuccessMessage = "Transaction successfully completed";
		String actualSuccessMessage = successMessage.getText();
				
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
				"Actual message does not contain expected message. \n Actual Message:" + actualSuccessMessage + "\n Expected Message:"  
						+ expectedSuccessMessage);
		sleep (2000);
		
		//close browser
		driver.quit();
	}
	
	private void sleep(long m) {
		try {
		Thread.sleep(m);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	}


}
