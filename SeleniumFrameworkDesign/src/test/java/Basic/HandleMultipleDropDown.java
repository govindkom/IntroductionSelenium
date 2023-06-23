package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {

	public static void main(String[] args) {
		// HandleMultipleDropDown
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//div[@class=\"drp1\"]//div[@class=\"dropdown\"]")).click();
		//driver.switchTo().alert().accept();
		
		
		//Logiv for Producty type
		List<WebElement> productlist=driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
		System.out.println("Number of options:"+productlist.size());
		
		for (WebElement ptype : productlist) 
		{
			if(ptype.getText().equals("Accounts"))
			{
			ptype.click();
				break;
		}

	}
		
		//Actions action = new Actions(driver);
		//action.build().perform();
		
		
		/// Logic for Select Product
		
		driver.findElement(By.xpath("//div[@class=\"drp2\"]//div[@class=\"dropdown open\"]")).click();
		
		List<WebElement> products=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
		System.out.println("Number of Products option:"+products.size());
		
		for (WebElement prod : products) 
		{
			if(prod.getText().equals("Salary Accounts"))
			{
				prod.click();
				break;
			}
		}
		
	}
}
