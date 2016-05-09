

	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	public class Multiselect {
	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	WebDriver driver = new FirefoxDriver();
	 
	// Put an Implicit wait, 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	driver.get("http://toolsqa.com/automation-practice-form");
	 
	Select oSelect = new Select(driver.findElement(By.id("continents")));
	 oSelect.selectByVisibleText("Europe");
	 
	Thread.sleep(2000);
	 

	oSelect.selectByIndex(2);
	Thread.sleep(2000);
	 
	List<WebElement> oSize = oSelect.getOptions();
	int iListSize = oSize.size();
	 

	for(int i =0; i < iListSize ; i++){

	String sValue = oSelect.getOptions().get(i).getText();

	System.out.println(sValue);

	if(sValue.equals("Africa")){
	oSelect.selectByIndex(i);
	break;
	}
	}	    

	driver.close();
	}
	}


