import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test(description = "Başarılı Kullanıcı Girişi")
    public void LoginSuccessful() {

        loginPage.fillusername("usersena")
                .fillPassword("test")
                .clickLoginButton();

        System.out.println("Test Deneme");
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(url, "https://parabank.parasoft.com/parabank/overview.htm");


    }

    @Test(description = "Başarısız Kullanıcı Girişi")
    public void LoginUnSuccessful() {

        webDriver.findElement(By.name("username")).sendKeys("admninhsn");
        webDriver.findElement(By.name("password")).sendKeys("admin1s23");
        webDriver.findElement(By.cssSelector("[value='Log In']")).click();
        String errorText = webDriver.findElement(By.cssSelector("[class='error'")).getText();
        Assert.assertEquals(errorText, "The username and password could not be verified.");


    }
}