/*Create our own Exceptions */
/*User Defined Exceptions:are raised by the user at our own condition & we will know to raise the exception explicitly we use throw keyword.*/
 import java.util.Scanner;
 class MyException extends Exception{
    public String message;
    public MyException(){
		message="invalid work...";
	}	
	public String toString(){
		return message;
	}
 }
 class UserDefinedException{
	 public static void main(String ar[]){
		 Scanner s1=new Scanner(System.in);
		 try{
			 System.out.println("Enter any no");
			 int num=s1.nextInt();
			 if(num%2==0)
				 System.out.println("Even no");
			 else 
				 throw new MyException();
		 }
		 catch(MyException e){
			 System.out.println(e);
		 }
	 }
 }