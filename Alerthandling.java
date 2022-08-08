import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \" ]")).click();
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.switchTo().alert().sendKeys("demo");
	}

}
