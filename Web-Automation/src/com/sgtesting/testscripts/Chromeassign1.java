package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeassign1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
				launchBrowser();
				navigate();
				login();
				minimizeFlyOutWindow();
				createuser();
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
		   public static void createuser()
			{
				try
				{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				oBrowser.findElement(By.name("firstName")).sendKeys("user1");
				oBrowser.findElement(By.name("lastName")).sendKeys("demo1");
				oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("firstuser");
				oBrowser.findElement(By.name("password")).sendKeys("12345");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
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

