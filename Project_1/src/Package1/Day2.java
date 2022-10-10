package Package1;

public class Day2 
{

	public int sum(int a,int b)
	
	{
		int a1;
		a1=a+b;
		System.out.println("Result of sum is " + a1);
		return a1;
			
	
	}
public int sub(int c,int d)
	
	{
		int b1;
		b1=c-d;
		System.out.println("Result of sub is " + b1);
		return b1;
			
	
	}
public int mult(int e,int f)

{
	int c1;
	c1=e*f;
	System.out.println("Result of mult is " + c1);
	return c1;
		

}
public int div(int g,int h)

{
	int d1;
	d1=g/h;
	System.out.println("Result of div is " + d1);
	return d1;
		

}
	public static void main(String[] args) 
	
	{
		Day2 obj=new Day2();
		int sumresult=obj.sum(10,2);
		int subresult=obj.sub(sumresult, 2);
		int sum1result=obj.sum(subresult, 2);
		int sub2=obj.mult(sum1result, 2);
		int result=obj.div(sub2, 2);
		System.out.println("Result of expression ((((10+2)-2)+2)*2)/2) is " + result);
				
		
		
		
		
	}
	

}
