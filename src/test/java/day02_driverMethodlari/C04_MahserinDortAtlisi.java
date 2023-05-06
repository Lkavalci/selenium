package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_MahserinDortAtlisi {
    public static void main(String[] args) {

        // Her zaman bu 4 lüyle başlayacagız

        // 1- driver çin gerekli ayarlamalari yap
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        // 2- webdriver olustur
        WebDriver driver = new ChromeDriver();

        // 3- windowU maximize et
        driver.manage().window().maximize();

        // 4- gecikmeler için maximum bekleme suresi tanimla
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // bu 4 adim her testin basında yapacağımız işlemlerdir.



    }
}
