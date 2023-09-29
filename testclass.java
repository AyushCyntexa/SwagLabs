import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // to find the link
        driver.get("https://www.saucedemo.com/");
        // enter the username and password
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        username.submit();
        // adding product to cart
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();
        // clicking on to the cart button
        WebElement checkoutButton = driver.findElement(By.className("shopping_cart_link"));
        checkoutButton.click();

        WebElement checkoutnewButton = driver.findElement(By.id("checkout"));
        checkoutnewButton.click();




        WebElement firstNameField = driver.findElement(By.id("first-name"));
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        WebElement postalCodeField = driver.findElement(By.id("postal-code"));

        firstNameField.sendKeys("Ayush");
        lastNameField.sendKeys("Srivastava");
        postalCodeField.sendKeys("302017");


        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

    }
}
