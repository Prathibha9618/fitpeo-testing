package com.Fitpeo.Tech.Private;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
// setup the browser
		WebDriverManager.chromedriver().setup();
		
//	creating object for webdriver
		WebDriver driver = new ChromeDriver();
		
//	maximize the window
		driver.manage().window().maximize();
		
//	1.Navigate to the FitPeo Homepage:
		driver.navigate().to("https://www.fitpeo.com/");
		Thread.sleep(300);
		
//	2.Navigate to the Revenue Calculator Page:
		driver.navigate().to("https://fitpeo.com/revenue-calculator");
		
//	3.Scroll Down to the Slider section:
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,500)");
		
//	4.Adjust the Slider:
        WebElement sliderValue = driver.findElement(By.cssSelector("span[data-index='0']"));
        System.out.println(sliderValue.getLocation());
        System.out.println(sliderValue.getSize());
        
//      Create an Actions object to perform the slider action
        Actions move = new Actions(driver);
        move.dragAndDropBy(sliderValue,94,0).perform();
		executor.executeScript("document.getElementById(':R57alklff9da:').value='820'");
		Thread.sleep(300);

//    5.Update the Text Field:
		executor.executeScript("document.getElementById(':R57alklff9da:').value='560'");
		Thread.sleep(100);

//    6.Validate Slider Value:
		System.out.println(sliderValue.getLocation());
		executor.executeScript("document.getElementById(':R57alklff9da:').value='560'");
		Thread.sleep(100);
		
//	 7.Select CPT Codes:

		executor.executeScript("document.getElementById(':R57alklff9da:').value='820'");
		executor.executeScript("window.scroll(500,800)");

		// Select the desired CPT Codes by clicking their corresponding checkboxes
		 driver.findElement(By.xpath("//div[p[contains(text(),'CPT-99091')]]//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//div[p[contains(text(),'CPT-99453')]]//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//div[p[contains(text(),'CPT-99454')]]//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//div[p[contains(text(),'CPT-99474')]]//input[@type='checkbox']")).click();


      
    } 
    


	}


