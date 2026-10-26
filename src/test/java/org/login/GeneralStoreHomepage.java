package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralStoreHomepage extends Baseclass{
	
	public GeneralStoreHomepage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement dropDown;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"India\"]")
	private WebElement india;
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement textBox;
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letshop;


	public WebElement getDropDown() {
		return dropDown;
	}


	public void setDropDown(WebElement dropDown) {
		this.dropDown = dropDown;
	}


	public WebElement getIndia() {
		return india;
	}


	public void setIndia(WebElement india) {
		this.india = india;
	}


	public WebElement getTextBox() {
		return textBox;
	}


	public void setTextBox(WebElement textBox) {
		this.textBox = textBox;
	}


	public WebElement getLetshop() {
		return letshop;
	}


	public void setLetshop(WebElement letshop) {
		this.letshop = letshop;
	}
	
	
	
	
	

}
