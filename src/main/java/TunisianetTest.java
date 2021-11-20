import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TunisianetTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
		
		driver.get("https://www.tunisianet.com.tn/");
	    driver.manage().window().setSize(new Dimension(1550, 840));
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg")).click();
	    driver.findElement(By.cssSelector(".user-down span")).click();
	    driver.findElement(By.name("email")).sendKeys("ghassendaoud99@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("ghassen999");
	    {
	      WebElement element = driver.findElement(By.cssSelector("html"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector("html"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector("html"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector("html")).click();
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.id("submit-login")).click();
	    driver.findElement(By.id("search_query_top")).click();
	    driver.findElement(By.id("search_query_top")).sendKeys("MacBook M1 13.3");
	    driver.findElement(By.cssSelector("#sp-btn-search > button")).click();
	    driver.findElement(By.linkText("PC Portable Apple MacBook Pro M1 (2020) 13.3\" / Argent")).click();
	    driver.findElement(By.cssSelector(".add-to-cart")).click();
	    driver.findElement(By.cssSelector(".btn-block:nth-child(1)")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".btn-block:nth-child(1)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    
	    Thread.sleep(2000);
	    driver.quit();
	  }
	}
