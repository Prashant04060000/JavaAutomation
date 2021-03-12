package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeassign9 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		impoertask();
		logout();
	     closeApplication();
			

	}
	public static void launchBrowser()
    {
    try
    {
    	String path=System.getProperty("user.dir");
    	System.setProperty("webdriver.chrome.driver",path+"\\Library\\driver\\chromedriver.exe");
    	oBrowser=new ChromeDriver();
    }catch(Exception e)
    {
    	e.printStackTrace();
    }
    }
    public static void navigate()
    {
    	try
    	{
    		oBrowser.get("http://localhost:81/login.do");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
   public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
  
   static void impoertask()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click(); 
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click(); 
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.id("//*[@id=\'infoLink\']")).click();
            Thread.sleep(5000);
		   oBrowser.findElement(By.xpath("//*[@id=\'infoPopupCloseButton\']")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'closeLoadTasksFromCSVPopupButton\']")).click();
		   Thread.sleep(2000);
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
   }
   static void logout()
  	{
  		try
  		{
  			oBrowser.findElement(By.linkText("Logout")).click();
  			Thread.sleep(2000);
  		}catch(Exception e)
  		{
  			e.printStackTrace();
  		}
  	}
  	
  	static void closeApplication()
  	{
  		try
  		{
  			oBrowser.close();
  		}catch(Exception e)
  		{
  			e.printStackTrace();
  		}
  	}
}
