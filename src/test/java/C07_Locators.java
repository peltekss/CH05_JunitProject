import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_Locators {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/index.html");
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void locatorsTest() {

        WebElement basicpagetest = driver.findElement(By.id("basicpagetest"));//id değeri ile locate ettiğimiz web elementi WebElement containerı içerisine atabiliriz.
        String text = basicpagetest.getText();//locate edilen web element üzerinde getText() methodu uygulandı.
        System.out.println("text = " + text);
        basicpagetest.click();//locate edilen web element üzerinde click() methodu uygulandı.

        //....


    }


}
