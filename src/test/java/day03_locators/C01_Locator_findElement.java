package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Locator_findElement {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));

        // 1-  amazon sayfasına gidin
        driver.get("https://www.amazon.com");

        // 2- arama kutusuna Nutella yazdırıp

         /*
            Test otomasyonu yaparken
            bir webelementi kullanmak istersek 2 seye ihtiyacimiz var
            1- o webelementi benzersiz olarak tarif edebilecegimiz bir locator
            2- bu locator'i soyledigimizde bize web elementi bulup getirecek method
            ornegin amazon sitesindeki arama kutusunun unique tarif edicisi olarak
            id = "twotabsearchtextbox" kullanabiliriz
         */
            WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        // data türü    objenin adi         =       findElement : webelementi bulan methot,
        //                                          By      : webElementi bulacağımız locatorun turunu yazdıgımız method
        //                                          twotabsearchtextbox : unique tarif için id attribute değeri

        aramaKutusuElementi.sendKeys("Nutella");
// istenen webelemente istenen yazıyı gönderir.


        //3- ENTER tusuna basarak arama yapin.

        aramaKutusuElementi.submit();
        // istenen web elementi uzerinde enter tusuna basar


       // Thread.sleep(5000);

        driver.close();

    }
}
