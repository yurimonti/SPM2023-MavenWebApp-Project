package unicam.spm2023.katalon;

import java.time.Duration;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Tag;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class Test1Katalon {
  private WebDriver driver;
  static ChromeOptions options = new ChromeOptions();
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  @Tag("AcceptanceTest")
  public void setUp() throws Exception {
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
  }

  @Test
  @Tag("AcceptanceTest")
  public void test1Katalon() throws Exception {
    driver.get("https://pros.unicam.it/");
    driver.findElement(By.cssSelector(".toggle-search")).click();
    driver.findElement(By.name("s")).click();
    driver.findElement(By.name("s")).clear();
    driver.findElement(By.name("s")).sendKeys("digital twin");
    driver.findElement(By.cssSelector(".searchform")).submit();
  }

  @After
  @Tag("AcceptanceTest")
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
