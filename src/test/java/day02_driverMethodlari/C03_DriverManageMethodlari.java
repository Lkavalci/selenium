package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
/*
            implicitlyWait bir websayfasi acilincaya veya
            aradigimiz elementler bulununcaya kadar
            driver'in bekleyecegi maximum sureyi belirler
         */
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi
           Kodlar calismaya basladiginda biz driver icin yol gostermezsek
           Selenium kendi driver'ini devreye sokuyor
           Ama baslangicta driver ayari aradigi icin biraz yavas calisiyor
            driver.manage().window().istenen ayar ile window'umuzu istedigimiz boyuta getirebilir
            veya window'un konum ve buyukluk bilgilerine ulasabiliriz

            Biz genelde bir teste baslamadan once
            window'u maximize yapmayi tercih ederiz

        */

        driver.get("https://www.amazon.com");

        System.out.println("Baslangicta Konum : " + driver.manage().window().getPosition()); //Baslangicta Konum : (10, 10)
        System.out.println("Baslangicta Boyut : " +driver.manage().window().getSize()); //Baslangicta Boyut : (1050, 708)

        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println("Maximize Konum : " + driver.manage().window().getPosition()); //Maximize Konum : (-8, -8)
        System.out.println("Maximize Boyut : " +driver.manage().window().getSize());//Maximize Boyut : (1382, 744)

        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("Fulscreen Konum : " + driver.manage().window().getPosition()); //Fulscreen Konum : (0, 0)
        System.out.println("Fulscreen Boyut : " +driver.manage().window().getSize()); //Fulscreen Boyut : (1366, 768)

        Thread.sleep(1000);
        driver.manage().window().minimize();
        System.out.println("Minimize Konum : " + driver.manage().window().getPosition());
        System.out.println("Minimize Boyut : " +driver.manage().window().getSize());


        // pencereyi istediğimiz boyut ve konuma getirebiliriz.

        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println("istedigimiz konum : "+driver.manage().window().getPosition()); //
        System.out.println("istedigimiz boyut : "+driver.manage().window().getSize());//


        Thread.sleep(15000);
        driver.close();

    }

}
