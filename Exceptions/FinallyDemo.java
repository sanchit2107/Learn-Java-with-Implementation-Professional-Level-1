/*use of "finally": finally block is always executed either exception ocur or not & it always given with try catch bloak.*/
 import java.util.Scanner;
 class Divide{
	public static int divideNumber(int a,int b){
		try{
			int c=a/b;
			return c;
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		finally{
			System.out.println("Hello!!...I am After try catch block....");
		}
	} 
 }
 class FinallyDemo{
 public static void main(String ar[]){
	 Scanner s1=new Scanner(System.in);
	 System.out.println("Enter two no");
	 int num1=s1.nextInt();
	 int num2=s1.nextInt();
	 int num3=Divide.divideNumber(num1,num2);
	 System.out.println("Result is="+num3);
 }
 }