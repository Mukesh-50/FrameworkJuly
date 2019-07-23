import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BrowserFactory;

public class Demo {

	public static void main(String[] args) throws IOException {

		
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://the-internet.herokuapp.com/basic_auth");
		Runtime.getRuntime().exec("C:\\Users\\Chandani_50\\Desktop\\demo.exe");
	}

}
