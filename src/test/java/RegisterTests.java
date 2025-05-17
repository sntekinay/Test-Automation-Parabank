import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterTests extends BaseTest {
    @Test(description = "Kayıt İşlemi")
    public void LoginSuccessful(){

        Random random = new Random();
        String firstName = "testFirstName";
        String lastName = "testLastName";
        String tempText = "test";
        String phoneNumber = "5555555555";
        String username = "test" + random.nextInt(100000);


        webDriver.findElement(By.cssSelector("[href*='register.htm']")).click();
        webDriver.findElement(By.id("customer.firstName")).sendKeys(firstName);
        webDriver.findElement(By.id("customer.lastName")).sendKeys(lastName);
        webDriver.findElement(By.id("customer.address.street")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.address.city")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.address.state")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.address.zipCode")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
        webDriver.findElement(By.id("customer.ssn")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.username")).sendKeys(username);
        webDriver.findElement(By.id("customer.password")).sendKeys("password");
        webDriver.findElement(By.id("repeatedPassword")).sendKeys("password");
        webDriver.findElement(By.cssSelector("[value='Register']")).click();

        String welcomeText = webDriver.findElement(By.cssSelector("[class='title']")).getText();
        Assert.assertEquals(welcomeText,"Welcome " + username);

        System.out.println(welcomeText + " için Kayıt Başarılı");


    }
}

