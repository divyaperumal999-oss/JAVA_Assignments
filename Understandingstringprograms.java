package Firstpackage;

public class Understandingstringprograms {
	static int countVowels(String str)
	   {
		String s7=str.toLowerCase();
		int count=0;
		for(int i=0;i<s7.length();i++)
		{
			//System.out.println(s7.charAt(i));
			if(s7.charAt(i)=='a'|| s7.charAt(i)=='e'||  s7.charAt(i)=='i'|| s7.charAt(i)=='o'|| s7.charAt(i)=='u')
			{
				count++;
			}
		}
		 
		return count;
	   }
	public static String reverseString(String str)
	 {
		String palicheck =str;
		String rev="";
		//System.out.println(str.length());
		 for(int a=str.length()-1;a>=0;a--)
		 { 
			 //System.out.println(str.charAt(a));
			 rev=rev+str.charAt(a);
		 }
		 //System.out.println(rev);
		 
		 //palindrome check
		 return rev;
	 }
	 public static void palindromecheck(String str, String reversedstringtolow)
	 { 
		 if(str.equals(reversedstringtolow))
		 {
			 System.out.print("Palindrome");
		 }
		 else
		 {
			 System.out.print("Not Palindrome");
	 }
	 }
	public static void main(String[] args) {
 	
//count vowels
	String str="dIVADFDSF";
	String tolow=str.toLowerCase();
	System.out.println(countVowels(str));
//reverse string
  String reversedstring=reverseString(str);
  System.out.println(reversedstring);
 //palindrome check 
  String reversedstringtolow=reversedstring.toLowerCase();
  palindromecheck(tolow,reversedstringtolow);

	}
}


