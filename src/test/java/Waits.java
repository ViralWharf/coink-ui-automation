import java.util.concurrent.TimeUnit;

public class Waits {

    //Implicitly Wait
    public static void waits(int seconds) {
        Test.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}
