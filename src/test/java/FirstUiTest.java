import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstUiTest {
    @Test
    public void firstSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", "C://Users/Artem/FROMASUS/AS_Automation/jsf-rep/testFortJuly2022/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("#W0wltc")).click();
        driver.findElement(By.name("q")).sendKeys("i.ua", Keys.ENTER);
        driver.findElement(By.cssSelector("a[href^='http://www.i.ua']")).click();
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("m2345");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("bnm,.bnm", Keys.ENTER);

        driver.quit();
    }

    @Test
    public void firstSeleniumTestWithManager() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.i.ua");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("m2345");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("bnm,.bnm", Keys.ENTER);

        driver.quit();
    }
}
