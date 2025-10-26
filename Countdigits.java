package Firstpackage;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputnumber=0;
		int i=0;
		int sum=0;
		if(inputnumber==0)
		{
			i=1;
		}
 while(inputnumber!=0)
 {
	int dig=(inputnumber%10);// 
	inputnumber=inputnumber/10;
	sum=sum+dig;
	i++;
 }
System.out.println("Count of digits:" +i); // 
System.out.println("Sum of digits:" +sum );
	}

}
