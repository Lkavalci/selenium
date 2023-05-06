package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C02_findElements {
    public static void main(String[] args) throws InterruptedException {


        /*
        Automation Exercise Category Testi
1- Bir test class’i olusturun ilgili ayarlari yapin
2- https://www.automationexercise.com/ adresine gidin
3- Category bolumundeki elementleri locate edin
4- Category bolumunde 3 element oldugunu test edin
5- Category isimlerini yazdirin
6- Sayfayi kapatin
automationexercise.com
Automation Exercise
This is for automation practice
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));

        driver.get("https://www.automationexercise.com");

//3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryElementsList =driver.findElements(By.className("panel-title"));

        //4- Category bolumunde 3 element oldugunu test edin
        int expectedSize=3;
        int actualSize= categoryElementsList.size();
        if (expectedSize==actualSize){
            System.out.println("Category element testi PASSED");
        }else {
            System.out.println("Category element testi FAILED");
        }
        //5- Category isimlerini yazdirin
        /*  System.out.println(categoryElementsList);
            Normalde bir list direk yazdirilabilir
            Ancak findElements() ile bulunan elementler Webelement oldugundan direk YAZDIRILAMAZ
            bir for-each loop kullanilarak listenin elementleri yazdirilabilir
         */
        for (WebElement eachElement: categoryElementsList
                ) {
                System.out.println(eachElement.getText() +" ");
                }
                //6- Sayfayi kapatin
                Thread.sleep(3000);
                driver.close();



    }
}

