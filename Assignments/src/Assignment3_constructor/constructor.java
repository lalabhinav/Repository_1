package Assignment3_constructor;

public class constructor 
{
	public constructor() //default constructor
	{
		this (111,222,333); // calling 3 PM constructor
		System.out.println("This is default constructor");
	}
	
	public constructor(int a) // 1 parameterized constructor
	{
		this(1111,2222,3333,4444); // calling 4 PM constructor
		System.out.println("This is one parameterized constructor");
	}
	
	public constructor(int a,int b) // 2 parameterized constructor
	{
		this (); // calling default constructor
		System.out.println("This is two parameterized constructor");
	}
	
	public constructor(int a,int b, int c) // 3 parameterized constructor
	{
		System.out.println("This is three  parameterized constructor");
	}
	
	public constructor(int a,int b,int c,int d) // 4 parameterized constructor
	{
		this(11,22); // calling 2 PM constructor
		System.out.println("This is four parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		constructor ob= new constructor(1);
		
	}
	
}
