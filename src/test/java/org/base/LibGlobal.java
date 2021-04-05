package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibGlobal {
	

	 public static  WebDriver driver;
	 // To launch driver
	 public static WebDriver getDriver() {
		 
		 // if we want to run in cross browser means we can use WebDriverManager code and am written in below
		 // WebDriverManager.chromedriver().setup();
		 // to launch in chrome browser
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\LennoxTask\\driver\\chromedriver.exe");
		 
		 driver=new ChromeDriver();
		 return driver;	
	 }

	 // To launch url
	 public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	 }
	 
	 //To set the value for sendkeys
	 public static void enterText(WebElement element, String data) {
		element.sendKeys(data);
	 }
	 
	 // methods to  click button functionality
	 public static void btnClk(WebElement  element) {
		element.click();
	 }
	 
	//Method for scrolldown 
	 public static void scrolldown(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	 }
	 
	//Method for setAttribute using JavaScriptExecutor
	 public static void setValue(String data,WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
		 }
	 

	//To select by value text
	public static void select(WebElement element,String data) {
		Select select=new Select(element);
		select.selectByVisibleText(data);
	}

	//Method for wait concept to handle exception
	public static void waitvisibleEle(WebElement ele) {
		 WebDriverWait w1=new WebDriverWait(driver,60);
		 w1.until(ExpectedConditions.elementToBeClickable(ele));

	}

	//method to handle exception

	public static void waitUntillClickable( WebElement element) {
	   WebDriverWait wait=new WebDriverWait(driver,90);
	   wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitTime() throws InterruptedException {
		Thread.sleep(3000);
			}
		

	 
	// To read the value from excel sheet
	 public static String readExcel(int row ,int cel) throws IOException {
		File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\LennoxTask\\Excel\\ExcelVlaues.xlsx");	
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row rows = sheet.getRow(row);
		Cell cell = rows.getCell(cel);
		String value = cell.getStringCellValue();
	  return value;
	 }
	 
	//To write the value in excel sheet
	 public static void writeExcel(int row, int cel, String data) throws IOException {
		File file = new File("C:\\Users\\ASUS\\eclipse-workspace\\LennoxTask\\Excel\\ExcelVlaues.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row rows = sheet.getRow(row);
		Cell cell = rows.createCell(cel);
		cell.setCellValue(data);
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
	 }
	 	
		


}
