package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");



        System.out.println(driver.getTitle()); // bize tittle i getirir.

        System.out.println(driver.getCurrentUrl()); // girilen url yi döndürür.

        System.out.println(driver.getPageSource()); // gidilen web sayfasının kaynak kodlarını döndürür. java ile yazılan script leri divleri yani kodlari getirir.

        System.out.println(driver.getWindowHandle()); // açılan her bir pencereye verilen unique hash code değeri verir.

        System.out.println(driver.getWindowHandles()); // Eger driver calişırken bir den fazla pencere veya tab
        // oluşturduysa windows /tab'lerin unique hash code larini bir set olarak döndürür.

        Thread.sleep(5000); // yazdığımız sayı sürecince kodu bekletir.
        driver.close(); // açilan brovseri kapatir.



    }
}
