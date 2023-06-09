package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IVTL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Papitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palani");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Banu");
		driver.findElement(By.name("departmentName")).sendKeys("DEEE");
		driver.findElement(By.name("description")).sendKeys("NewForm");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("papithapalani28@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByVisibleText("New York");
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println(driver.getTitle());


		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infoview");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PapithaP");
		driver.findElement(By.className("smallSubmit")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
