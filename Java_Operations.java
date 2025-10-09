package Firstpackage;

public class Java_Operations {

public static void main(String[] args) {
// Store marks of 3 subjects  
  int maths=70;
  int science=95;
  int english=82;
  int total=(maths+science+english);    //Calculate total marks using arithmetic operations
  float average=total/3f;       //Calculate average marks using suitable data type
  System.out.println("Total marks obtained=" +total);  //Print both total and average
  System.out.println("Average marks=" +average);
  int int_average=total/3;   //change data type of average variable
  double double_average = average;
   System.out.println("Converted average="+int_average);
   System.out.println("Converted average="+double_average);
	}

}
