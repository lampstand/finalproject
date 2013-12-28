import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

reportsDir = 'target/test-reports/geb'
System.setProperty 'webdriver.chrome.driver','c:/dev/chromedriver.exe'

driver = { new ChromeDriver() }

//autoClearCookies = true

environments {

	// run as 'grails -Dgeb.env=chrome test-app'
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	// run as 'grails -Dgeb.env=firefox test-app'
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = { new FirefoxDriver() }
	}
}
