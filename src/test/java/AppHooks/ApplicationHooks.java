package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.igc.factory.DriverFactory;
import com.igc.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks extends DriverFactory {

	private DriverFactory driverFactory;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.initializeProperties();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("BrowserName");
		driverFactory = new DriverFactory();
		driver = driverFactory.initializeDriver(browserName);

	}

	@Before(order = 2)
	public void LaunchApplicationURL() {
		String url = prop.getProperty("URL");
		driver.get(url);

	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}

}
