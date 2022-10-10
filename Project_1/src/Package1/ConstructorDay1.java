package Package1;

/*first assignment(output should be in the below sequence)---using this keyword
three parameterized constructor  
default constructor   
two parameterized constructor 
one parameterized constructor */

public class ConstructorDay1 {
	
	public ConstructorDay1()
	{
		this(4,3,2); 
		System.out.println("This is the Deafult construstor.");
	}
	public ConstructorDay1(int a)
	{
	this(1,2);
		System.out.println("This is the Single Parameter construstor.");
	}
	public ConstructorDay1(int a, int b)
	{
	this();
	
		System.out.println("This is the 2 Parameter construstor.");
		
	}
	public ConstructorDay1(int a, int b,int c)
	{
	
		System.out.println("This is the 3 Parameter construstor.");
	}
	
	public static void main(String[] args) {
		ConstructorDay1 obj=new ConstructorDay1(1);
			
		
	}

}
