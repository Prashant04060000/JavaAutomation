package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeassign7 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		 deletecustomer();
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
   static void createcustomer()
   {
	   try
	   {
	   oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click(); 
	   oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
	   oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	   Thread.sleep(2000);
	   oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Prashant");
	   Thread.sleep(2000);
	   oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
	   Thread.sleep(2000);
	   
	   
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
   }
   static void createproject()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")).click(); 
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("TargetJava");

		   Thread.sleep(5000);
		   oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
		   Thread.sleep(2000);
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
   }
   static void  createtask()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click(); 
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("ReachTheGoal");
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("")).click();
		   Thread.sleep(2000);
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
   }
   static void  deletetask()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click(); 
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		   Thread.sleep(2000);
		  
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")).click();
		   Thread.sleep(2000);
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
   }
   static void deleteproject()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
		   Thread.sleep(2000);
		   
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
	   
   }
   static void deletecustomer()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
