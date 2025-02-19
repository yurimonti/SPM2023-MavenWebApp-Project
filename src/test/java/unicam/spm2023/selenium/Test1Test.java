package unicam.spm2023.selenium;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.junit.jupiter.api.Tag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;
public class Test1Test {
  private WebDriver driver;
  static ChromeOptions options = new ChromeOptions();
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  @Tag("AcceptanceTest")
  public void setUp() {
    vars = new HashMap<String, Object>();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
  }
  @After
  @Tag("AcceptanceTest")
  public void tearDown() {
    driver.quit();
  }
  @Test
  @Tag("AcceptanceTest")
  public void test1() {
    driver.get("https://pros.unicam.it/");
    driver.findElement(By.cssSelector(".toggle-search")).click();
    driver.findElement(By.name("s")).click();
    driver.findElement(By.name("s")).sendKeys("digital twin");
    driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
  }
}
