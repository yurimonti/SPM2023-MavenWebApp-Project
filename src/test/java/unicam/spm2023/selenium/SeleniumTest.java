package unicam.spm2023.selenium;

import static org.junit.jupiter.api.Assertions.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	@Tag("AcceptanceTest")
	static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	@Tag("AcceptanceTest")
	void tearDown() throws Exception {

	}

	@Test
	@Disabled
	void checkProsSite() throws InterruptedException {
		//System.out.println(projectPath)
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/spm2023");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "SPM 2023";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		assertEquals(et,at);
		driver.close();
		driver.quit();
	}

}
