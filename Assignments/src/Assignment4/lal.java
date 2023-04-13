// Assignment 2 of day 6

// Child class
package Assignment4;

public class lal extends abhi
{
	public lal()
	{
		this (45,46);
		System.out.println("this is child default constructor");
	}
	
	public lal(int a)
	{
		this ();
		System.out.println("this is child 1 parameterized constructor");
	}
	
	public lal(int a, int b)
	{
		super(10);
		System.out.println("This is clild 2 parameterized constructor");
	}
	
	public lal(int a, int b, int c)
	{
		this (25);
		System.out.println("This is child 3 parameterized constructor");
	}

	public static void main(String[] args) {
		
		lal ob = new lal(12,14, 16);
	}
	
	
	
}
