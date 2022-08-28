import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Test {
    static AppiumDriver driver;

    public static void main(String[] args) throws Exception {

        setUp();

        //Tests
        loginThreeFailed();
        validationAccountBlock();

        tearDown();
    }

    @Before
    public static void setUp() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "POCO X4 Pro 5G");
        cap.setCapability("udid", "e3c0c1fbd0ab");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");

        cap.setCapability("appPackage", "com.coink.app");
        cap.setCapability("appActivity", "com.coink.app.MainActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub/");

        driver = new AppiumDriver(url, cap);
        System.out.println("Test iniciado...");

        // Ubication Screen
        /*driver.findElement(By.xpath("//*[@text='Ionic App']")).click();
        driver.findElement(By.xpath("//*[@text='SOLO ESTA VEZ']")).click();*/
    }

    @org.junit.Test
    public static void loginThreeFailed() throws InterruptedException {
        Login.login();

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("1234");
            Waits.waits(3);
        }
    }

    @org.junit.Test
    public static void validationAccountBlock() {
        Test.driver.findElement(By.xpath("//*[@text='Cuenta bloqueada']")).isDisplayed(); // Validation
    }

    @After
    public static void tearDown() {
        System.out.println("Finalizando test...");
        Waits.waits(5);
        driver.quit();
    }
}
