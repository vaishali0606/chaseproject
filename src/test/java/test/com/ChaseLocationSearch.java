/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Vaishali
 */
public class ChaseLocationSearch {
    private WebDriver driver;
    private String baseUrl;
    private String zipCode;
    private String location;
    private String zipCode2;
    private String location2;
    
    public ChaseLocationSearch() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");    
    driver = new ChromeDriver();
   // baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    FileInputStream inputStream = new FileInputStream(new File("c:\\data\\location.xlsx"));
         
        Workbook workbook = new XSSFWorkbook(inputStream);
        //getting first worksheet
        Sheet firstSheet = workbook.getSheetAt(0);
        //get first row
        Row r =  firstSheet.getRow(1);
        Cell c = r.getCell(0); //zipcode value
        zipCode = String.valueOf((int) c.getNumericCellValue()); 
        c = r.getCell(1); //username value
        location = c.getStringCellValue();
        Row r2 = firstSheet.getRow(2);
        c = r2.getCell(0);
        zipCode2 = String.valueOf((int) c.getNumericCellValue());
        c = r2.getCell(1);
        location2 = c.getStringCellValue();
        System.out.println("Row 1 Zipcode = " + zipCode);
        System.out.println("Row 1 Location = " + location);
        System.out.println("Row 2 Zipcode = " + zipCode2);
        System.out.println("Row 2 Location = " + location2);
        inputStream.close();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
    public void testChase1() throws Exception {
    driver.get("https://locator.chase.com/?locale=en_US");
    // driver.findElement(By.linkText("ATM & branch")).click();
    driver.findElement(By.id("q")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys(zipCode);
    driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
   }
    
   @Test
   public void testChase2() throws Exception {
    driver.get("https://locator.chase.com/?locale=en_US");
    driver.findElement(By.id("q")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys(location);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Please enter a ZIP code, or an address, city and state.'])[1]/following::button[1]")).click();
   } 
   
     @Test
    public void testChase3() throws Exception {
    driver.get("https://locator.chase.com/?locale=en_US");
    // driver.findElement(By.linkText("ATM & branch")).click();
    driver.findElement(By.id("q")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys(zipCode2);
    driver.findElement(By.id("q")).sendKeys(Keys.RETURN);

   }
    
   @Test
   public void testChase4() throws Exception {
    driver.get("https://locator.chase.com/?locale=en_US");
    driver.findElement(By.id("q")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys(location2);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Please enter a ZIP code, or an address, city and state.'])[1]/following::button[1]")).click();
   } 

}