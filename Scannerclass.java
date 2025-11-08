package Firstpackage;
import java.util.Scanner; 	

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your inputs");
		String name =sc.nextLine();
		int age=sc.nextInt();
		float salary=sc.nextFloat();
		double annualsalary=sc.nextDouble();
		boolean automationqa=sc.nextBoolean();
		if(automationqa)
		{
			qa="Yes";
		}
		else
		{
			qa="No";
		}
		System.out.println("The employee " +name+" of age "+age +" is being paid a monthly salary of " +salary +" and an annual salary of " +annualsalary+ "\nQA Automation experience " +qa);                                                                                         
	}

}
