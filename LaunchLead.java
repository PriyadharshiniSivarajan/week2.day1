package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		String pageTitle = driver.getTitle();
		System.out.println("Title is" + pageTitle);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmSfa = driver.findElement(By.linkText("CRM/SFA"));
		crmSfa.click();
		WebElement clickLeads = driver.findElement(By.linkText("Leads"));
		clickLeads.click();
		WebElement createLeads = driver.findElement(By.linkText("Create Lead"));
		createLeads.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("IBM India Pvt ltd");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Jennifer");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Aniston");
		WebElement firstLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstLocal.sendKeys("Jenni");
		WebElement lastLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastLocal.sendKeys("Aniston");
		WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("Miss");
		WebElement birthDate = driver.findElement(By.id("createLeadForm_birthDate"));
		birthDate.sendKeys("9/1/97");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("64");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3000000");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jenniferaniston@gmail.com");
		driver.findElement(By.name("generalToName")).sendKeys("Jenifer");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("12th cross streest,5 Th avenue");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Manhattan");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("617895");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9156324523");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop = new Select(state);
		drop.selectByValue("CA");
		WebElement createLead = driver.findElement(By.className("smallSubmit"));
		createLead.click();
		String pageTitle2= driver.getTitle();
		System.out.println("Title is" +pageTitle2);
		String str ="View Lead";
		if(str.equals(pageTitle2));
		{
			System.out.println("Title verified");
		}

	}

}
