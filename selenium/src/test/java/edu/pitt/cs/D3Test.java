// Generated by Selenium IDE
package edu.pitt.cs;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 686x1020 | 
    driver.manage().window().setSize(new Dimension(686, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | assertElementPresent | xpath=//a[contains(@href, '/reset')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 1182x1020 | 
    driver.manage().window().setSize(new Dimension(1182, 1020));
    // 3 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true"; | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 4 | click | xpath=//a[contains(@href, '/reset')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/reset\')]")).click();
    // 5 | assertText | xpath=//div[@id='listing']/ul/li | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("ID 1. Jennyanydots"));
    // 6 | assertText | xpath=//div[@id='listing']/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 7 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(text(),'Catalog')] | 
    driver.findElement(By.xpath("//a[contains(text(),\'Catalog\')]")).click();
    // 5 | storeAttribute | xpath=//li[2]/img@src | result
    {
      WebElement element = driver.findElement(By.xpath("//li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("result", attribute);
    }
    // 6 | assert | result | /images/cat2.jpg
    assertEquals(vars.get("result").toString(), "http://localhost:8080/images/cat2.jpg");
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(text(),'Catalog')] | 
    driver.findElement(By.xpath("//a[contains(text(),\'Catalog\')]")).click();
    // 5 | assertElementPresent | xpath=//div[@id='listing']/ul/li[3] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[3]"));
      assert(elements.size() > 0);
    }
    // 6 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(@href, '/rent-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    // 5 | assertElementPresent | xpath=//button[contains(.,'Rent')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
      assert(elements.size() > 0);
    }
    // 6 | assertElementPresent | xpath=//button[contains(.,'Return')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(@href, '/rent-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    // 5 | click | xpath=//input[@id='rentID'] | 
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).click();
    // 6 | type | xpath=//input[@id='rentID'] | 1
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).sendKeys("1");
    // 7 | click | xpath=//button[contains(.,'Rent')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    // 8 | assertText | xpath=//div[@id='listing']/ul/li | Rented out
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("Rented out"));
    // 9 | assertText | xpath=//div[@id='listing']/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 11 | assertText | xpath=//div[@id='rentResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'rentResult\']")).getText(), is("Success!"));
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=true";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(@href, '/rent-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    // 5 | click | xpath=//input[@id='returnID'] | 
    driver.findElement(By.xpath("//input[@id=\'returnID\']")).click();
    // 6 | type | xpath=//input[@id='returnID'] | 2
    driver.findElement(By.xpath("//input[@id=\'returnID\']")).sendKeys("2");
    // 7 | click | xpath=//button[contains(.,'Return')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Return\')]")).click();
    // 8 | assertText | xpath=//div[@id='listing']/ul/li | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("ID 1. Jennyanydots"));
    // 9 | assertText | xpath=//div[@id='listing']/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 11 | assertText | xpath=//div[@id='returnResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'returnResult\']")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(@href, '/feed-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/feed-a-cat\')]")).click();
    // 5 | assertElementPresent | xpath=//button[contains(.,'Feed')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(@href, '/feed-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/feed-a-cat\')]")).click();
    // 5 | click | id=catnips | 
    driver.findElement(By.id("catnips")).click();
    // 6 | type | id=catnips | 6
    driver.findElement(By.id("catnips")).sendKeys("6");
    // 7 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 8 | assertText | xpath=//div[@id='feedResult'] | Nom, nom, nom.
    assertThat(driver.findElement(By.xpath("//div[@id=\'feedResult\']")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | click | xpath=//a[contains(@href, '/greet-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/greet-a-cat\')]")).click();
    // 5 | assertText | xpath=//div[@id='greeting']/h4 | Meow!Meow!Meow!
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow!Meow!Meow!"));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | http://localhost:8080//greet-a-cat/Jennyanydots | 
    driver.get("http://localhost:8080//greet-a-cat/Jennyanydots");
    // 2 | setWindowSize | 810x1020 | 
    driver.manage().window().setSize(new Dimension(810, 1020));
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 4 | assertText | xpath=//div[@id='greeting']/h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow! from Jennyanydots."));
  }
}
