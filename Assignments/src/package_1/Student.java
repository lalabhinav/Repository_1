package package_1;

public class Student 
{
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) 
	{
		
		Student lal=new Student();
		lal.display1();
		lal.age=30;
		System.out.println(lal.age);
		
		lal.display2();
		lal.rollno=1234;
		System.out.println(lal.rollno);
		
	}

}
