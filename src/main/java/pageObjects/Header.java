package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
	
public WebDriver driver;

public Header(WebDriver driver ) 
{
	// TODO Auto-generated constructor stub
	this.driver=driver;

}

By Menu = By.xpath("//div[@class='account-menu']");

By Menu_List=By.xpath("//div[@class='account-menu']//li");

By Notification=By.xpath("//div[@class='shopping-cart']");	

By AccountMenu=By.xpath("(//span[@class='account-title'])[1]");

By Logout=By.xpath("(//a[text()='Logout'])[1]");


By MyProfile=By.xpath("(//a[text()='My Profile'])[1]");

By ChangePassword=By.xpath("(//a[text()='Change Password'])[1]");

By SetNotifications=By.xpath("(//a[text()='Set Notifications'])[1]");

By Address=By.xpath("(//a[text()='Address Of Use'])[1]");

By Users=By.xpath("(//a[text()='User Management'])[1]");



public WebElement getMenu_List()
{
	return driver.findElement(Menu_List);
}

public WebElement getMenu()
{
	return driver.findElement(Menu);
}


public WebElement getUsers()
{
	return driver.findElement(Users);
}

public WebElement getAddress()
{
	return driver.findElement(Address);
}


public WebElement getSetNotifications()
{
	return driver.findElement(SetNotifications);
}

public WebElement getChangePassword()
{
	return driver.findElement(ChangePassword);
}


public WebElement getMyProfile()
{
	return driver.findElement(MyProfile);
}

public WebElement getLogout()
{
	return driver.findElement(Logout);
}

public WebElement getAccountMenu()
{
	return driver.findElement(AccountMenu);
}

public WebElement getNotification()
{
	return driver.findElement(Notification);
}



}
