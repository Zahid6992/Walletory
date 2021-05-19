package LunchChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Firstmaven {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThinkPad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.develop.walletory.net/account/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("login-email")).sendKeys("abastaid1977@cuvox.de");
		Thread.sleep(1000);
		driver.findElement(By.id("login-pass")).sendKeys("Test6992");
		Thread.sleep(1000);
		driver.findElement(By.id("kt_login_signin_submit")).click();
		Thread.sleep(1000);
		
		
		
		
		}

	}
