package Firstpackage;

public class Loopsinjava
{
	public static void main(String args[])
//Sum of 100 numbers 
	{
		int sum=0;
		for (int i=1;i<=100;i++)
		{
		sum=sum+i;
		}
		System.out.println(sum);
	
	
//Factorial of a number 
	int fact = 8;
	int mul=1;
	for(int b=1;b<=fact;b++)
	{
		 mul=mul*b;
		
	}
	System.out.println(mul);	

	
//reverse a number 
	int number=12143243;
	int original=number;
	int rev=0;
	while(number!=0)
	{
	int dig=(number%10);// 
	number=number/10;
	rev= rev*10 + dig;
	}
	System.out.println(rev);
//checking palindrome 
	if(rev==original)
	{
		System.out.println("Palindrome");
	}
	else 
	{
	System.out.println("Not Palindrome");
	
}

//Print multiplication table of a number '
	int mulnum=7;
	for (int a=1;a<=20;a++)
	{
		mul=mulnum*a;
		System.out.println(mulnum + "*" + a + "=" + mul);
	}
	
	}
}


