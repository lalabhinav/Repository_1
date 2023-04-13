package assignment2;

public class calculation 
{
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Return of 1st method is:"+c);
		return c;
	}
	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Return of 2nd method is:"+z);
		return z;
	}
	
	public void mul(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("Reeturn of 3rd method is:"+a3);
	}
	
	public static void main(String[] args) 
	{
		calculation object=new calculation();
		int sumresult = object.sum(10,2);
		int subresult=object.sub(10, 2);
		object.mul(sumresult, subresult);
		
	}


}
