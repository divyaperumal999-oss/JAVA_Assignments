package Firstpackage;

public class JavaConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math=40;
		int science=38;
		int english=38;
		int average = (math+science+english)/3;
		 if(math<35 ||science<35 ||english < 35)
		{
			System.out.println("Failed due to low score in at least one subject.");
		}
		 else if (average>=90 && average<=100)
		{
			System.out.println("Grade: A+ \nExcellent performance");
		}
		else if (average>=75 && average<=89)
		{
			System.out.println("Grade: A \nExcellent performance");
		}

		else if (average>=60 && average<=74)
		{
			System.out.println("Grade: B \nKeep improving");
		}
		else if (average>=40 && average<=59)
		{
			System.out.println("Grade: C \nKeep improving");
		}
		else if(average<40)
			System.out.println("Fail.\nPlease work harder next time.");

		else
			System.out.println("Invalid marks");
		

}
}
