// Assignment 2 of day 6

// Parent class
package Assignment4;

public class abhi {
	
	public abhi()
	{
		this (25,26,27);
		System.out.println("This is paarent default constructor");
	}
	public abhi(int a)
	{
		this (15,25);
		System.out.println("This is parent 1 parameterized constructor");
	}
	public abhi(int a, int b)
	{
		this ();
		System.out.println("This is parent 2 parameterized constructor");
	}
	public abhi(int a, int b, int c)
	{
		System.out.println("This is parent 3 parameterized constructor");
	}

}
