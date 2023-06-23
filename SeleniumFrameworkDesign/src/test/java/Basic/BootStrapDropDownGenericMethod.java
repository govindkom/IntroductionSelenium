package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDownGenericMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//div[@class=\"drp1\"]//div[@class=\"dropdown\"]")).click();
		//driver.switchTo().alert().accept();
		
		
		//Logiv for Producty type
		List<WebElement> productlist=driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
		System.out.println("Number of options:"+productlist.size());
		selectoptionfromdropdown(productlist,"Accounts");
		
		
		
		//Actions action = new Actions(driver);
		//action.build().perform();
		
		
		/// Logic for Select Product
		
		driver.findElement(By.xpath("//div[@class=\"drp2\"]//div[@class=\"dropdown open\"]")).click();
		
		List<WebElement> products=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
		System.out.println("Number of Products option:"+products.size());
		selectoptionfromdropdown(products, "Salary Accounts");
		
	}

	public static void selectoptionfromdropdown(List<WebElement>noptions, String value)
	{
		for (WebElement ptype : noptions) 
		{
			if(ptype.getText().equals(value))
			{
			ptype.click();
				break;
		}
	}


	}
}
