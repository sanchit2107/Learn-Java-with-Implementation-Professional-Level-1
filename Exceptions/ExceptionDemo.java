/*An unexpected unwanted event that disturbs the normal flow of the programm is called Exception...*/
/*e.g. Coming from Home to Class i.e.,Sleeping Exception..*/
/*OBJECTIVE-"If something goes wrong we should not lose something". It provides Graceful Termination of the programm..*/
/*PURPOSE-Defining the alternative way & continue is the main purpose of the exception Handling.*/

class ExceptionDemo{
	public static void main(String ar[]){
		System.out.println("Statement 1....");
		System.out.println("Statement 2...");
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		System.out.println("Statement 3...");
		try{
			System.out.println("Division Process is going on..");
			System.out.println("Process started..");
			int c=a/b;								//throw new ArithmeticException()
			System.out.println("Result has come..."+c);
		}
	    catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("process finished...");
		System.out.println("Thanks for visit...");
	}
}