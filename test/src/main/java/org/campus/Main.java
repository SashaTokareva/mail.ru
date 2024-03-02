package org.campus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Указываем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Microsoft\\Windows\\Start   Menu\\Program/chromedriver.exe");

        // Инициализируем экземпляр WebDriver
        WebDriver driver = new ChromeDriver();

        // Открываем mail.ru
        driver.get("https://mail.ru");

        // Закрываем браузер
        driver.quit();
    }
}
