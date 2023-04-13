package Another;

public class class1 
{
	public void method1()
	{
		System.out.println("this is method 1 of class 1");
	}
	
	public void method2()
	{
		System.out.println("this is method 2 of class 1");
	}
	public static void main(String[] args) 
	{
		class1 ob1= new class1();
		ob1.method1();
		ob1.method2();
		
		class2 ob2 = new class2(); //creating object of another class
		ob2.method3();				// calling method o another class
		ob2.method4();
	}

}
