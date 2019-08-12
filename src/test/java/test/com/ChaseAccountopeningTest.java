/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Vaishali
 */
public class ChaseAccountopeningTest {
    private WebDriver driver;
  private String baseUrl;
    
    public ChaseAccountopeningTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");    
    driver = new ChromeDriver();
   // baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
  public void testChaseaccount() throws Exception {
    driver.get("https://secure03b.chase.com/web/oao/application/retail?productCode=010&subProductCode=390-111&zipCode=&eCouponCode=EN9722724FGE2UQY#/origination/gettingStarted/gettingStarted/initiate;cfgCode=010390-010111;channel=C30;sourceCode=null;params=010,390-111,,no,no,,,");
    //driver.findElement(By.xpath("//*[@id=\"DA_807324568357\"]/div[3]/div/p")).click();
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enjoy up to $350'])[1]/following::button[1]")).click();
   // driver.findElement(By.id("ChampionAccountButton")).click();
    driver.findElement(By.id("input-existingCustomer-radio-1")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Open your Chase Total Checking and Chase Savings accounts.'])[1]/following::div[2]")).click();
    driver.findElement(By.id("NEXT-nav-ctr-btn")).click();
    driver.findElement(By.id("blx-nameBlock-first-name-fldgrp-text-validate-input-field")).click();
    driver.findElement(By.id("blx-nameBlock-first-name-fldgrp-text-validate-input-field")).clear();
    driver.findElement(By.id("blx-nameBlock-first-name-fldgrp-text-validate-input-field")).sendKeys("Test");
    driver.findElement(By.id("blx-nameBlock-middle-name-fldgrp-text-validate-input-field")).clear();
    driver.findElement(By.id("blx-nameBlock-middle-name-fldgrp-text-validate-input-field")).sendKeys("t");
    driver.findElement(By.id("blx-nameBlock-last-name-fldgrp-text-validate-input-field")).clear();
    driver.findElement(By.id("blx-nameBlock-last-name-fldgrp-text-validate-input-field")).sendKeys("test");
    driver.findElement(By.id("dateOfBirth-label")).click();
    driver.findElement(By.id("dateOfBirth-text-validate-input-field")).clear();
    driver.findElement(By.id("dateOfBirth-text-validate-input-field")).sendKeys("01/02/1993");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tell us about yourself.'])[1]/following::div[2]")).click();
    driver.findElement(By.id("maskedSocialSecurityNumber-text-validate-input-field")).click();
    driver.findElement(By.id("maskedSocialSecurityNumber-text-validate-input-field")).clear();
    driver.findElement(By.id("maskedSocialSecurityNumber-text-validate-input-field")).sendKeys("***-**-6789");
    driver.findElement(By.id("select-identificationTypeId-select-validate")).click();
    new Select(driver.findElement(By.id("select-identificationTypeId-select-validate"))).selectByVisibleText("Driver's license");
    driver.findElement(By.id("select-identificationTypeId-select-validate")).click();
    driver.findElement(By.id("identificationNumber-text-validate-input-field")).click();
    driver.findElement(By.id("identificationNumber-text-validate-input-field")).clear();
    driver.findElement(By.id("identificationNumber-text-validate-input-field")).sendKeys("a1235477879023");
    driver.findElement(By.id("expirationDate-text-validate-input-field")).click();
    driver.findElement(By.id("expirationDate-text-validate-input-field")).clear();
    driver.findElement(By.id("expirationDate-text-validate-input-field")).sendKeys("01/31/2020");
    driver.findElement(By.id("select-stateId-select-validate")).click();
    new Select(driver.findElement(By.id("select-stateId-select-validate"))).selectByVisibleText("Illinois");
    driver.findElement(By.id("select-stateId-select-validate")).click();
  }

}




