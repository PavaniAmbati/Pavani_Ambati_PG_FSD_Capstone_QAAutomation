package com.simplilearn.worshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdminTests {
	

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
			String url = "http://localhost:4200/adminlogin";
			driver.get(url);
			System.out.println("Page is Opened");
			
			// enter username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("admin");
			sleep(2000);
			// enter password
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("admin2");
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
			String url = "http://localhost:4200/adminlogin";
			driver.get(url);
			System.out.println("Page is Opened");
			
			// enter username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("admin");
			sleep(2000);
			// enter password
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("admin1");
			sleep(2000);
			// click login button
			WebElement loginButton = driver.findElement(By.id("loginbutton"));
			loginButton.click();
			sleep(2000);
			
			// verification on new url
			String expectedurl = "http://localhost:4200/adminhome";
			String actualurl = driver.getCurrentUrl();
			Assert.assertEquals(actualurl, expectedurl, "Actual page url is not expected");
			
			sleep (2000);
			
			//close browser
			driver.quit();
		}
		
		@Test 
		public void positiveOnlineAccountAuthorizeTest() {
			
			System.out.println("Starting online account authorize test");
			//create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			sleep(2000);
			
			//maximize browser window
			driver.manage().window().maximize();
			
			//open test page
			String url = "http://localhost:4200/adminlogin";
			driver.get(url);
			System.out.println("Page is Opened");
			
			// enter username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("admin");
			sleep(2000);
			// enter password
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("admin1");
			sleep(2000);
			// click login button
			WebElement loginButton = driver.findElement(By.id("loginbutton"));
			loginButton.click();
			sleep(2000);
			
			// click customermanager button
			WebElement customermanagerButton = driver.findElement(By.id("customermanager"));
			customermanagerButton.click();
			sleep(2000);
			
			// select status
			WebElement status = driver.findElement(By.name("Authorize"));
			status.sendKeys("block");
			sleep(2000);
			
			// click submit status button
			WebElement submitButton = driver.findElement(By.id("submitbutton"));
			submitButton.click();
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
		public void positiveChequetAuthorizeTest() {
			
			System.out.println("Starting cheque book request authorize test");
			//create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			sleep(2000);
			
			//maximize browser window
			driver.manage().window().maximize();
			
			//open test page
			String url = "http://localhost:4200/adminlogin";
			driver.get(url);
			System.out.println("Page is Opened");
			
			// enter username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("admin");
			sleep(2000);
			// enter password
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("admin1");
			sleep(2000);
			// click login button
			WebElement loginButton = driver.findElement(By.id("loginbutton"));
			loginButton.click();
			sleep(2000);
			
			// click chequemanager button
			WebElement chequemanagerButton = driver.findElement(By.id("chequemanager"));
			chequemanagerButton.click();
			sleep(2000);
			
			// select status
			WebElement status = driver.findElement(By.name("Authorize"));
			status.sendKeys("decline");
			sleep(2000);
			
			// click submit status button
			WebElement submitButton = driver.findElement(By.id("submitbutton"));
			submitButton.click();
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
		
		private void sleep(long m) {
			try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}


}
