package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageF extends BaseMethod {
	public PageF() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='SHOP'])[1]")
	private WebElement shop;
	
	@FindBy(xpath="(//a[contains ( text(),'Dime® 2 Tru')])[1]")
	private WebElement headphone;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement add;

	public WebElement getShop() {
		return shop;
	}

	public WebElement getHeadphone() {
		return headphone;
	}

	public WebElement getAdd() {
		return add;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
