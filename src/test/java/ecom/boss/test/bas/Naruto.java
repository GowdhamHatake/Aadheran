package ecom.boss.test.bas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naruto {
	
	public WebDriver driver;
	
	public Select s;
	
public void browserLaun() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}

public void url(String url) {

	driver.get(url);
	driver.manage().window().maximize();
}

public WebElement locName(String xpa) {

	WebElement findElement = driver.findElement(By.xpath(xpa));
	return findElement;
}

public Select sel(WebElement element) {

	 s = new Select(element);
	return s;
}

public void cli(WebElement element) {

	element.click();
}












}
