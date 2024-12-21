package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions actions;
	public static void attente (int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

	public static void maximazeWindow() {
		driver.manage().window().maximize();
	}
}
