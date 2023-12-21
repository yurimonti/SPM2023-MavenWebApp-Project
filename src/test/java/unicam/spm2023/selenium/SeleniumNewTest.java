package unicam.spm2023.selenium;

import static org.junit.jupiter.api.Assertions.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.ArrayList;

class SeleniumNewTest {
	static WebDriver driver;

	static ChromeOptions options = new ChromeOptions();

	@BeforeAll
	@Tag("AcceptanceTest")
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		options.addArguments("--headless");
	}
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	@Tag("AcceptanceTest")
	static void tearDownAfterClass() throws Exception {		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	@Tag("AcceptanceTest")
	void setUp() throws Exception {
		driver = new ChromeDriver(options);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	@Tag("AcceptanceTest")
	void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	@Disabled
	@Tag("AcceptanceTest")
	void checkProsSite() throws InterruptedException {

		driver.get("http://localhost:8080/spm2023");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "SPM 2023";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		assertEquals(et,at);
		
		
	}
	
	@Test
	@Disabled
	void checkProsSiteSearch() throws InterruptedException {
		
		// navigate your driver to mail.google.com
		driver.get("https://pros.unicam.it/");

		Thread.sleep(4000);
		
		//Find Element by className
		driver.findElement(By.className("toggle-search")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("search")).click();
		
		Thread.sleep(4000);

		driver.findElement(By.className("search")).sendKeys("Digital Twin");

		driver.findElement(By.className("search")).sendKeys(Keys.RETURN);

		Thread.sleep(4000);

		List<WebElement> elements = driver.findElements(By.xpath("//div//div//a"));
		ArrayList<String> retrieved_text = null;

		boolean textPresent=false;

		for (WebElement element : elements) {

			//System.out.println("text:" + element.getText());
			//String text = element.getText();

			if(element.getText().equals("Digital Twin"))textPresent=true;

		}

		assertTrue(textPresent);
		//TO COMPLETE
			
	}



}
