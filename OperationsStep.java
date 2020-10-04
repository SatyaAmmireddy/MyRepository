package CucumberParameterizationStep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OperationsStep {
	
	String source = "//input[@value=\"Delhi\"]";
	String clickOnSuggestedCity = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]";
	String destination = "//input[@placeholder=\"To\"]";
	String searchbtn = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a";
	String availablePackagesPage = "//*[@id='left-side--wrapper']/p";
	String date = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span";
	String dayPicker = "DayPicker";
	
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
	
	public WebElement fromCity() throws Exception {
		WebElement fromcity = driver.findElement(By.xpath(source));
		return fromcity;
	}
	
	public WebElement clickOnCity() throws Exception {
		WebElement option = driver.findElement(By.xpath(clickOnSuggestedCity));
		return option;
	}
	
	public WebElement toCity() throws Exception {
		WebElement tocity = driver.findElement(By.xpath(destination));
		return tocity;
	}
	
	public WebElement travelDate() throws Exception {
		WebElement selectionDate = driver.findElement(By.xpath(date));
		return selectionDate;
	}
	
	public void datePicker() throws Exception {
		WebElement datepicker = driver.findElement(By.className(dayPicker));
//		List<WebElement> dayPickerMonth = datepicker.findElements(By.className("DayPicker-Body"));
//		for(WebElement month:dayPickerMonth) {
//			List<WebElement> dayPickerWeek = month.findElements(By.className("DayPicker-Week"));
//			for(int i=0;i<=dayPickerWeek.size();i++) {
//				List<WebElement> dates = dayPickerWeek.get(i+2).findElements(By.className("DayPicker-day"));
//				dates.get(1).click();
//				break;
//			}
		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.ESCAPE).build().perform();
//		}
	}
	
	public WebElement search() throws Exception {
		WebElement search = driver.findElement(By.xpath(searchbtn));
		return search;
	}
	
	public String availablePackagesPage() throws Exception {
		String msg = driver.findElement(By.xpath(availablePackagesPage)).getText();
		return msg;
	}
	
	public void closeBrowser() throws Exception {
		driver.close();
		driver.quit();	
	}
}
