//Assignment 1 of Day 6

package Assignment4;
import java.util.Scanner;

public class abhinav 
{
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public int sub(int d, int e)
	{
		int f;
		f=d-e;
		return f;
	}
	
	public int mul(int g, int h)
	{
		int i;
		i=g*h;
		return i;
	}
	
	public float div(int j, int k)
	{
		int l;
		l=j/k;
		return l;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter x1: ");
		Scanner s1= new Scanner(System.in);
		int x1 = s1.nextInt();
		System.out.println("Value of x1 "+x1);
		
		System.out.println("Please enter x2: ");
		Scanner s2= new Scanner(System.in);
		int x2 = s2.nextInt();
		System.out.println("Value of x2: "+x2);
		
		System.out.println("Please enter x3: ");
		Scanner s3= new Scanner(System.in);
		int x3 = s3.nextInt();
		System.out.println("Value of x3 "+x3);
		
		System.out.println("Please enter x4: ");
		Scanner s4= new Scanner(System.in);
		int x4 = s2.nextInt();
		System.out.println("Value of x4: "+x4);
		
		System.out.println("Please enter x5: ");
		Scanner s5= new Scanner(System.in);
		int x5 = s2.nextInt();
		System.out.println("Value of x5: "+x5);
		
		System.out.println("Please enter x6: ");
		Scanner s6= new Scanner(System.in);
		int x6 = s2.nextInt();
		System.out.println("Value of x5: "+x6);
		
		abhinav ob = new abhinav();
		int cal1 = ob.add(x1,x2);
		int cal2 = ob.add(cal1, x3);
		int cal3 = ob.sub(cal2, x4);
		int cal4 = ob.mul(cal3, x5);
		float cal5 = ob.div(cal4, x6);
		
		System.out.println("First calculation ((((x1+x2)+x3)-x4)*x5)/x6 is: " +cal5);
		
		int cal6 = ob.mul(x1, x2);
		int cal7 = ob.sub(cal6, x3);
		int cal8 = ob.sub(cal7, x4);
		int cal9 = ob.add(cal8, x5);
		float cal10 = ob.div(cal9, x6);
		
		System.out.println("Second calculation ((((x1*x2)-x3)-x4)+x5)/x6 is:"+cal10);
		
	}
}
