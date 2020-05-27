package my_first_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launch_browser {
	public static WebDriver driver =null;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mural\\eclipse-workspace\\selenium tutorial\\Chrome_driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement myelement=driver.findElement(By.className("_3qLQ-U8m"));
		myelement.sendKeys("iPhone XR (64GB) - Yellow");
		driver.findElement(By.className("nav-input")).click();		
		String amazonValue=driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(amazonValue);
		
		driver.navigate().to("https://flipkart.com");
		Actions actionnew = new Actions(driver);
		
		driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		driver.findElement(By.xpath("//*[@id='popsubform']/a/img")).click();
		WebElement myelementnew=driver.findElement(By.className("O8ZS_U"));
		myelementnew.sendKeys("iPhone XR (64GB) - Yellow");
		driver.findElement(By.className("xmlns=\"http://www.w3.org/2000/svg\"")).click();		
		String flipkartValue=driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(flipkartValue);
		if(Integer.parseInt(amazonValue)>Integer.parseInt(flipkartValue))
		{
			System.out.println("flipkart price is cheaper.");
		}
		else
		{
			System.out.println("amazon price is cheaper.");
		}
		
	}
	
	

}
