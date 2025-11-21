import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class testcase1 {

    protected AndroidDriver driver;


    @BeforeMethod
    public void setup() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setApp("C:\\Users\\Dynabook\\Downloads\\mda-2.2.0-25.apk");
        options.setAutomationName("UiAutomator2");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        System.out.println("setup IsDone");
    }

    @Test
    public void sampleTest() throws InterruptedException {
        System.out.println("AppLaunch IsDone");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/menuIV")).click();
        Thread.sleep(2000);
        // login
        driver.findElement(AppiumBy.accessibilityId("Login Menu Item")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET")).clear();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET")).sendKeys("bod@example.com");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET")).clear();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET")).sendKeys("10203040");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/loginBtn")).click();
        System.out.println("Login IsDone");

        // add Element to cart
        Thread.sleep(2000);
        driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cartBt")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cartIV")).click();
        System.out.println("AddElementToCart IsDone");

        // checkout
        Thread.sleep(2500);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cartBt")).click();
        Thread.sleep(2500);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/fullNameET")).sendKeys("FullName");
        Thread.sleep(2500);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/address1ET")).sendKeys("AddressLine");
        Thread.sleep(2500);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cityET")).sendKeys("Turo");
        Thread.sleep(2500);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/zipET")).sendKeys("12345");
        Thread.sleep(2500);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/countryET")).sendKeys("UK");
        Thread.sleep(2500);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn")).click();
        System.out.println("AddShippingData IsDone");

        // Enter Payment Method
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET")).sendKeys("OMAR OMER");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cardNumberET")).sendKeys("1111222233334444");
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/expirationDateET")).sendKeys("03/25");
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/securityCodeET")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn")).click();
        Thread.sleep(2000);
        System.out.println("AddPaymentMethod IsDone");
        driver.findElement(AppiumBy.accessibilityId("Completes the process of checkout")).click();
        System.out.println("CompleteCheckout IsDone");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Tap to open catalog")).click();
        System.out.println("backToProductsList IsDone");
        Thread.sleep(2000);
        System.out.println("AddPaymentMethod&CheckOut IsDone");



        // logout
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/menuIV")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Logout Menu Item")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.id("android:id/button1")).click();
        System.out.println("Logout IsDone");
        Thread.sleep(2000);




    }


    @AfterMethod
    public void tearDown(){
//        if (driver != null) {
//            driver.quit();
//        }

    }
}
