import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "G:\\Dev & QA\\IT Bootcamp\\Materijal\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.navigate().to("https://www.stealmylogin.com/demo.html");

            WebElement usernameInput = driver.findElement(By.name("username"));
            usernameInput.sendKeys("milancorluka");
            WebElement passwordInput = driver.findElement(By.name("password"));
            passwordInput.sendKeys("milan123");
            WebElement loginButton = driver.findElement(By.xpath("//form[@method = 'post']/input[3]"));
            loginButton.click();

            String expectedResult = "https://example.com/";
            String actualResult = driver.getCurrentUrl();

            if (expectedResult.equals(actualResult))
                System.out.println("Nice.");
            else
                System.out.println("Not nice.");

            Thread.sleep(3000);

            driver.close();
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
