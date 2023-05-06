package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(aramaKutusuElementi.isDisplayed()); // true // görünüyor mu? demek
        System.out.println(aramaKutusuElementi.isDisplayed()); // true // ulaşılabiliyor mu? demek
                                            //.. aramaKutusuElementi.isSelect  seçilebiliyor mu?

        System.out.println(aramaKutusuElementi.getText()); // varsa webelementlerdeki yazıyı getirir

        aramaKutusuElementi.sendKeys("Nutella");
        Thread.sleep(3000);
        aramaKutusuElementi.clear(); // cubuga Nutelle yazdı 3 sn bekledi ve sildi.

        System.out.println(aramaKutusuElementi.getSize()); // (912, 38) arama kutusunun boyutunun pixelini verir
        System.out.println(aramaKutusuElementi.getSize().height); // 38

        System.out.println(aramaKutusuElementi.getTagName()); // input locate edilen bir elementin tag name ni verir.
        System.out.println(aramaKutusuElementi.getAttribute("class"));
        // nav-input nav-progressive-attribute

        System.out.println(aramaKutusuElementi.getLocation());// (325, 11) pixel olarak konum

        System.out.println(aramaKutusuElementi.getRect().getDimension()); // (912, 38)


        Thread.sleep(3000);
        driver.close();


    }
}
