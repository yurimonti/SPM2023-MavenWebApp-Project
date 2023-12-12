package unicam.spm2023.selenium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	@Disabled
	void checkProsSite() throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/unicam/spm2023/drivers/chromedriver.exe");

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
