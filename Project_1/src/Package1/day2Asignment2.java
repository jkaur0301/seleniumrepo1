package Package1;

public class day2Asignment2 {
	
	
	public int sum (int s1,int s2)
	
	
	{
		int addition;
		addition=s1+s2;
		String one =" Result of adding "+ s1 ;
		String two = " with " +s2;
		String three = " is " +addition;
	//	System.out.println("Result of adding " +s1);
	//	System.out.println(" with " +s2 );
		   System.out.println(one + two + three + addition);
		  
		   
		  return addition;			
	
	}
	

public int sub (int sub1,int sub2)
	
	
	{
		int subtract;
		subtract=sub1-sub2;
		System.out.println("Result of sub is " + subtract);
		return subtract;			
	
	}
public int div (int div1,int div2)


{
	int division;
	division=div1/div2;
	System.out.println("Result of div is " + division);
	return division;			

}
public int multi (int multi1,int multi2)


{
	int multiplication;
	multiplication=multi1*multi2;
	System.out.println("Result of multi is " + multiplication);
	return multiplication;			

}
public static void main(String[] args) 
{
	{
		
		
		day2Asignment2 obj=new day2Asignment2();
		int multiply=obj.multi(10, 2);
		int subresult=obj.sub(multiply, 2);
		int sumresult=obj.sum(subresult,2);
		int subresult1=obj.sub(sumresult,2);
		int result=obj.div(subresult1, 2);
		System.out.println("Result of expression ((((10*2)-2)+2)-2)/2) is " + result);
				
		
		
		
		
	}	
}

}
