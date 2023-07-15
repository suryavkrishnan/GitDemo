package StepDefenitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TextContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import java.util.*;

public class Hooks {
	
	TextContextSetup object2;
	public Hooks(TextContextSetup object1)
	{
		this.object2=object1;
	}
	
	@After
	public void AfterScenario() throws IOException
	{
		object2.testBaseObj.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException 
	{
		WebDriver driver=object2.testBaseObj.WebDriverManager();
		if(scenario.isFailed())
		{
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "ImageSS");
			
		}
	}
	

}
