/**
 * 
 */
package assignment2;

public class assignment2 
{
	public int sum(int a,int b){
		int c;
		c=a+b;
		System.out.println("Return of sum method is: " +c);
		return c;
	}
	public int sub(int x,int y){
		int z;
		z=x-y;
		System.out.println("Return of sub method is:" +z);
		return z;
	}
	public int mul(int a1, int a2){
		int a3;
		a3=a1*a2;
		System.out.println("Return of mul method is:" +a3);
		return a3;
	}
	public float div(int d,int e){
		float f;
		f=d/e;
		System.out.println("Return div method"+f);
		return f;	
	}
	
	public static void main(String[] args) 
	{
		assignment2 object=new assignment2();
		int cal1 = object.sum(10,2);
		int cal2 = object.sum(cal1, 2);
		int cal3 =object.sub(cal2, 2);
		int cal4 = object.mul(cal3, 2);
		float firstresult = object.div(cal4, 2); // (((((10+2)+2)-2)*2)/2)
		System.out.println("1st result is:"+firstresult);
		
		int cal5 = object.mul(10, 2);
		int cal6 = object.sub(cal5, 2);
		int cal7 = object.sum(cal6, 2);
		int cal8 = object.sub(cal7, 2);
		float secondresult = object.div(cal8, 2); // (((((10*2)-2)+2)-2)/2)
		System.out.println("2nd calculation:"+secondresult);
		
	}
}
