package learn;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAll {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				".\\exefiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://helloparent.in/");
	try {
		Thread.sleep(5000);
		System.out.println("Waiting for loading webpage");
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	List<WebElement> allelements = driver.findElements(By.xpath("//img[@src=\"https://hp.azureedge.net/Assests/images/logo-298x90.png\"]"));
	    for(int i=1;i<allelements.size();i++)
		 {
		allelements.get(i).click();
		System.out.println("CLicked on->" + allelements.get(i));
	
		/*try {
			Thread.sleep(10000);
			System.out.println("clicked and waiting for load");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//driver.navigate().back();
		/*try {
			Thread.sleep(3000);
			System.out.println("clicked for back");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
}