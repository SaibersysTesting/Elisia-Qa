import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver f1= new FirefoxDriver();
		f1.findElement(By.xpath("//input[@name='q']")).sendKeys("golf");
		f1.findElement(By.xpath("//button[@class='btn btn-search']")).click();
	
	}

}
