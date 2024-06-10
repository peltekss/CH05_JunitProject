package homework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Hw03 {
    /*
    Go to Clarusway homepage
    Do the following tasks by creating 3 different test methods.
    Check if the URL contains clarusway.
    Check if the title does not contain Python.
    Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"
    */
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://clarusway.com/");
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test//Test if the URL contains clarusway.
    public void urlContainsTest() {
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("clarusway"));
    }
    @Test//Check if the title does not contain Python.
    public void titleTest() {
        assertFalse(driver.getTitle().contains("Python"));
    }
    @Test//Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"
    public void titleEqualsTest() {
        assertEquals("Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce", driver.getTitle());
    }
}

