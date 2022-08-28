import org.openqa.selenium.By;

public class Login {

    public static void login(){
        Waits.waits(5);
        Test.driver.findElement(By.xpath("//*[@text='REGISTRARME']")).isDisplayed(); // Validation
        Test.driver.findElement(By.xpath("//*[@text='YA TENGO UNA CUENTA']")).click();
        Test.driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Número de celular']]]")).sendKeys("3112614149");
        Waits.waits(10);
        Test.driver.findElement(By.xpath("//*[@text='INGRESAR']")).click();
        Waits.waits(3);
    }
}

