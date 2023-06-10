package tests.web.tests;


import org.testng.annotations.Test;

import com.config.factory.BrowserStackConfigFactory;
import com.driver.factory.web.remote.BrowserStackFactory;

public class HomePageTest {
	
	
	@Test
	public void testHomePage() {
		
		System.out.println(BrowserStackConfigFactory.getConfig().broswerStackURL());
		
		
		
		
	}

}
