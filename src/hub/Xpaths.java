package hub;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver.TargetLocator.*;

public class Xpaths {
	//signup
	@FindBy(xpath=("//a[contains(.,' Sign Up')]"))
	public WebElement uname;
	
	//username
	@FindBy(xpath=("//input[@placeholder='Username']"))
	WebElement username;
	
	//email
	@FindBy(xpath=("//input[@placeholder='Email']"))
	WebElement email;
	
	//password
	@FindBy(xpath=("//input[@placeholder='Password']"))
	WebElement password;
	
	//confirm
	@FindBy(xpath=("//input[@placeholder='Confirm Password']"))
	WebElement confirm;

	//privacypolicy
	@FindBy(className=("consent1"))
	WebElement checkpolicy;
	
	//promotion
	@FindBy(className=("consent2"))
	WebElement checkpro;
	
	//Create account
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	WebElement create;
	
	//Privacy link
	@FindBy(linkText=("Privacy Policy"))
	WebElement privacy;
   	
	//Terms and condition
	@FindBy(linkText=("Terms of Service"))
	WebElement terms;
	
	//Cockies
	@FindBy(linkText=("Cookie Policy"))
	WebElement cockies;
	
	//Store
	@FindBy(linkText=("Store"))
	WebElement store;
	
	//Support
	@FindBy(linkText=("Support"))
	WebElement support;
	
	//mailinator
	@FindBy(name="search")
    WebElement mailinator; 
	
	//Signup
    @FindBy(xpath = "//button[contains(@value,'Search for public inbox for free')]")
	WebElement mailclick;
    
    //mail
    @FindBy(xpath = "//td[contains(@class,'ng-binding')]")
    WebElement clickonmail;
    
    //GettheCode
    @FindBy(xpath="//td[contains(@align,'centre')]")
    WebElement getcode;
    
    //scroll inside
    @FindBy(linkText=("You're almost there!"))
    WebElement scrollinside;
    
    //Paste code
    @FindBy(className=("hubble-signup-bodybg"))
    WebElement pastecode;
    
    //Verify
    @FindBy(xpath = "//*[text()=' Verify')]")
    WebElement verifybutton;
    
    //ResendOtp
    @FindBy(linkText=("Resend verification code"))
    WebElement resendotp;
    


    

	

	
	WebDriver driver;
	public Xpaths(WebDriver driver)
	{
    PageFactory.initElements(driver,this);
    }
	
	public void email(String mail) {
	try {
	email.sendKeys(mail);
	} catch (NoSuchElementException e) {
        System.out.println("Element not found: " );
    }}
    
	
	public void setPass(String pwd)
	 {
		try {
	password.sendKeys(pwd);
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
	
    public void repass(String pwd1)
    {
		try {
    confirm.sendKeys(pwd1);
    } catch (NoSuchElementException e) {
        System.out.println("Element not found: " );
    }}

    
    public void checkpolicy()
    {
		try {
    checkpolicy.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void checkpromo()
    {
		try {
    checkpro.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void clickLogin()
    {
		try {
	uname.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void user(String user)
    {
		try {
    username.sendKeys(user);
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void createac()
    {
		try {
    create.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void privacy1()
    {
		try {
    privacy.click();	
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void terms1()
    {
		try {
    terms.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    
    public void coockies1()
    {
		try {
    cockies.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void store1()
    {
		try {
    store.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void support1()
    {
		try {
    support.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    public void mailinator2(String mailinator3)
    {
		try {
    mailinator.click();
		} catch (NoSuchElementException e) {
	        System.out.println("Element not found: " );
	    }}
    
    
    
    public void mailclick2()
    {
 		try {
    mailclick.click();
	} catch (NoSuchElementException e) {
        System.out.println("Element not found: " );
    }}
    
    
    public void clickonmail2()
    {
 		try {
    clickonmail.click();
	} catch (NoSuchElementException e) {
        System.out.println("Element not found: " );
    }}
    
    
    
    public String getcode1()
    {
    return getcode.getText();	
    }
    
    
    public void scrollinside1()
    {
 		try {
    scrollinside.click();
 		} catch (NoSuchElementException e) {
 	        System.out.println("Element not found: " );
 	    }}
   
    
    public void pastecode1()
    {
 		try {
    pastecode.click();
 		} catch (NoSuchElementException e) {
 	        System.out.println("Element not found: " );
 	    }}
    
    
    
    public void verifybutton1()
    {
 		try {
    verifybutton.click();
 		} catch (NoSuchElementException e) {
 	        System.out.println("Element not found: " );
 	    }}
   
    
    public void resendotp1()
    {
 		try {
    resendotp.click();
		} catch (NoSuchElementException e) {
 	        System.out.println("Element not found: " );
 	    }}

    
  


   public void clearall()
   {
	   username.clear();
	   email.clear();
	   password.clear();
	   confirm.clear();
   }
}







