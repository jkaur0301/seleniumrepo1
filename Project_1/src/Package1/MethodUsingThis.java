package Package1;

public class MethodUsingThis {

	/*
output should be in the below sequence
three parameterized method 
default method
one parameterized method
two parameterized method
four parameterized method*/
	
	
	public void MethodUsingThis1()
	{
		System.out.println("Changes done by Jaspreet.");
		System.out.println("This is default method.");
	}
	public void MethodUsingThis2(int a)
	{
		
		System.out.println("This is parameterized method");
		this.MethodUsingThis3(1, 3);
		this.MethodUsingThis4(1, 2, 3, 4);
	}
	public void MethodUsingThis3(int a,int b)
	{
		
		System.out.println("This is  two parameterized method");
	}
	public void MethodUsingThis3(int a,int b,int c)
	{
		System.out.println("This is  three parameterized method");
		this.MethodUsingThis1();
		this.MethodUsingThis2(1);
	}
	public void MethodUsingThis4(int a,int b,int c,int d)
	{
		
		System.out.println("This is four parameterized method");
	}
	public static void main(String[] args) {
		
		MethodUsingThis obj=new MethodUsingThis();
		obj.MethodUsingThis3(1,2,3);
	}
}

