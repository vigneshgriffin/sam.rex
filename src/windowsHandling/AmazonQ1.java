package windowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonQ1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jay Kumar"
			+ "\\eclipse-workspace\\selenium\\SeleniumDay2\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	
	d.navigate().to("https://www.snapdeal.com/");
	d.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("iphones 7");
	Thread.sleep(5000);
	d.findElement(By.xpath("(//span[@class='searchTextSpan'])")).click();
	d.findElement(By.xpath("(//img[@title='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]")).click();
	
	String paretid = d.getWindowHandle();
	System.out.println(paretid);
	Set<String> allid = d.getWindowHandles();
	System.out.println(allid);
	 for (String x : allid) {
		if (!(paretid.equals(x))) {
			d.switchTo().window(x);
			
		}
		
	}
	 d.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
	 Thread.sleep(3000);
	 WebElement txtx = d.findElement(By.xpath("(//span[text()='Rs. 39,899'])[2]"));
	 String text = txtx.getText();
 	 System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}