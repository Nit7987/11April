package testjava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testjava3 {

	public static void main(String[] args) throws Exception {
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium class\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
                  driver.get("https://demoqa.com/browser-windows");
                  driver.manage().window().maximize();
                  Thread.sleep(2000);
                  JavascriptExecutor js=(JavascriptExecutor) driver;
                  js.executeScript("window.scrollBy(0,100)");
                 driver.findElement(By.xpath("//button[@id='windowButton']")).click();
                 
                 Set<String> all=driver.getWindowHandles();
                 System.out.println(all);
                 
                 Iterator<String> abc=all.iterator();
                      String win1=abc.next();
                      String win2=abc.next();
                      
                      driver.switchTo().window(win1);
                      System.out.println("Paraent window"+ win1);
                      
                      driver.switchTo().window(win2);
                      System.out.println("child window"+ win2);
                      driver.quit();
	}


	}


