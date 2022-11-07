package ecom.boss.test.bas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Uzumaki {
	
public static void main(String[] args) throws InterruptedException {
	
	Naruto n = new Naruto();
	
	n.browserLaun();
	
	n.url("https://www.facebook.com/login/");
	
	WebElement element = n.locName("//a[text()='Sign up for Facebook']");
	
    n.cli(element);	
	
	Thread.sleep(3000);
	
    WebElement element2 = n.locName("//select[@title='Year']");	
	
	Select sel = n.sel(element2);
	
	sel.selectByVisibleText("2021");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
