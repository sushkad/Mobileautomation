 package com.travalab.appointment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Appointment2 extends AppointmentXPath 
{
    public static WebDriver d;
    JavascriptExecutor js = (JavascriptExecutor) d;

    @BeforeSuite
    public void setup() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().deleteAllCookies(); 
        d.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("New Appointmant page"); 
        String url = "https://staging.travalab.com/appointments/new";
        Thread.sleep(100);
    }

    public static void selectValueFromDropDown(WebElement element, String value)
    {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    
    // AlphaCor Dx
    @Test (priority=1)
    public void TC1Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Stella");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Samantha");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Samantha@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC1Appointments=========================>");
    }
   
    
    @Test (priority=2)
    public void TC2Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Keely");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Marny");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Marny@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC2Appointments=========================>");
    }
    
    
    
    @Test (priority=3)
    public void TC3Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Latifah");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Melissa");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Melissa@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC3Appointments=========================>");
    }
    
    @Test (priority=4)
    public void TC4Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Katelyn");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Lydia");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Lydia@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC4Appointments=========================>");
    }
    
    @Test (priority=5)
    public void TC5Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Rosalyn");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Lacy");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Lacy@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC5Appointments=========================>");
    }
    @Test (priority=6)
    public void TC6Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Nayda");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Mari");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Mari@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC6Appointments=========================>");
    }
    @Test (priority=7)
    public void TC7Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Mallory");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Indira");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Indira@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC7Appointments=========================>");
    }
  
    @Test (priority=8)
    public void TC8Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Rana");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Maisie");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Maisie@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC8Appointments=========================>");
    }
    
    @Test (priority=9)
    public void TC9Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Sophia");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Breanna");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Breanna@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC9Appointments=========================>");
    }
    
    @Test (priority=10)
    public void TC10Appointments() throws InterruptedException, IOException
    {
        JavascriptExecutor js = (JavascriptExecutor) d;  
        d.get("https://staging.travalab.com/appointments/new");
        System.out.println("User on Appointment Page");
        Thread.sleep(200);
        d.findElement(By.xpath(receivedKit)).click();
        System.out.println("Kit Received YES");
        Thread.sleep(200);

        d.findElement(By.xpath(FirstName)).sendKeys("Regina");
        System.out.println("Enter First Name");
        d.findElement(By.xpath(LastName)).sendKeys("Alma");
        System.out.println("Enter Last Name");
        d.findElement(By.xpath(DOB)).sendKeys("02/03/2005");
        System.out.println("Enter DOB");
        d.findElement(By.xpath(Emailid)).sendKeys("Alma@gmail.com");
        System.out.println("Enter Email ID");
        d.findElement(By.xpath(PhoneNumber)).sendKeys("3273313041");
        System.out.println("Enter PhoneNumber");
        //Thread.sleep(200);
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(Next)));
        d.findElement(By.xpath(Next)).click();
        System.out.println("Click On Next Button");
        js.executeScript("arguments[0].scrollIntoView();", d.findElement(By.xpath(schAnApp)));
        //d.navigate().back();      
        Thread.sleep(200);
        
        d.findElement(By.id(Address)).sendKeys("3686 Grandview Pkwy");
        System.out.println("Enter Address");
        Thread.sleep(3000);
        d.findElement(By.id(Address)).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        d.findElement(By.id(Address)).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        d.findElement(By.xpath(AddressNext)).click();
        Thread.sleep(3000);
        System.out.println("Click on AddressNext button");
        Thread.sleep(300);
        
        WebElement lab = d.findElement(By.id("appointment_organisation_details_organisation"));
        selectValueFromDropDown(lab,"AlphaCor Dx");
        Thread.sleep(300);
        d.findElement(By.xpath(Allergenis)).click();
        System.out.println("Select Allergenis Lab kit");
        Thread.sleep(300);

        d.findElement(By.xpath(LabNext)).click();
        Thread.sleep(100);
        System.out.println("Click on Lab Next button");
        
        String AppDate = "January 31, 2023";
        d.findElement(By.xpath("//span[@aria-label='"+AppDate+"' and (@tabindex)]")).click();
        System.out.println("Click on Date field");
        Thread.sleep(200);
        //d.findElement(By.xpath(Date31)).click();
        //Thread.sleep(200);
        d.findElement(By.xpath(Time)).click();
        Thread.sleep(200);
        d.findElement(By.xpath(Time1)).sendKeys("12");
        Thread.sleep(100);
        d.findElement(By.xpath(Time1)).sendKeys(Keys.ENTER);
        System.out.println("Enter Hours");
        Thread.sleep(200);
        d.findElement(By.xpath(AdditionalRequest)).sendKeys("Lab Name: AlphaCor Dx");
        System.out.println("Enter Lab Name");
        Thread.sleep(200);
        d.findElement(By.xpath(Nextbuttondateandtime)).click();
        System.out.println("Click on Next Date & Time");
        Thread.sleep(7000);

        System.out.println("Your appointment request was created successfully for Lab Name: AlphaCor Dx");
        Thread.sleep(300);
        TakesScreenshot scrShot1 =((TakesScreenshot)d);
        File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("D://WireFrame//BILLION TO ONE Appointment2.png");
        FileUtils.copyFile(SrcFile1, DestFile1);

        Thread.sleep(300);
        System.out.println(" ================End TC10Appointments=========================>");
    }
  

    @AfterSuite
    public void CloseApp()
    {
        d.quit();
        System.out.println("Application Close");        
    }
}
