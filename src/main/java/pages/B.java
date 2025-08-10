package pages;

import org.openqa.selenium.WebDriver;

public class B extends A
{
	
	WebDriver driver;
	
	
	public B(int a)
	{
		super("14 june");
		System.out.println("B class constructor");
		System.out.println("Value of a is "+a);
	}
	
	
	
	
	public static void main(String[] args) {
		
		B b = new B(12);
		
		
		System.out.println(b.driver);
		
	}
	

}