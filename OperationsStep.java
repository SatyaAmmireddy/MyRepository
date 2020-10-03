package ExcelOperationsStepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationsStep {
	
	WebDriver driver;
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathya ammireddy\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void timeOut() throws Exception {
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	}
	
	public void openApplication(String url) throws Exception {
		driver.get(url);
	}
	
	public void refreshBrowser() throws Exception {
		driver.navigate().refresh();
	}
	
	public WebElement createAccount() throws Exception {
		WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]/div/p"));
		return createAccount;
	}
	
//	public WebElement tripSelection() throws Exception {
//		WebElement trip = driver.findElement(By.xpath("//li[@data-cy=\"roundTrip\"]/span[@class=\"tabsCircle appendRight5\"]"));
//		return trip;
//	}
	
	public WebElement fromCity() throws Exception {
		WebElement fromcity = driver.findElement(By.xpath("//input[@value=\"Delhi\"]"));
		return fromcity;
	}
	
	public WebElement clickOnCity() throws Exception {
		WebElement option = driver.findElement(By.id("react-autowhatever-1-section-0-item-0"));
		return option;
	}
	
	public WebElement toCity() throws Exception {
		WebElement tocity = driver.findElement(By.xpath("//input[@value=\"Bangalore\"]"));
		return tocity;
	}
	
	public WebElement search() throws Exception {
		WebElement search = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
		return search;
	}
	
	public String availablePackagesPage() throws Exception {
		String msg = driver.findElement(By.xpath("//*[@id='left-side--wrapper']/p")).getText();
		return msg;
	}
	
	public void closeBrowser() throws Exception {
		driver.close();
		driver.quit();	
	}
}
