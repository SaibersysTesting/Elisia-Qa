import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions abc=new Actions(driver);
		WebElement pqr=driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));
		abc.moveToElement(pqr).build().perform();
		driver.close();

	}

}
