class NullPointerException{
public static void main(String ar[]){
 System.out.println("Statement 1...");
 try{
	 String n=null;
	 System.out.println(n.toUpperCase());		//throw new NullPointerException()
	 System.out.println("Statement 2...");
	 int a=Integer.parseInt(ar[0]);				//throw new ArrayIndexOutOfBoundsException()
	 int b=Integer.parseInt(ar[1]);				
	 System.out.println("Statement 3...");
	 System.out.println("Division process is going on...");
	 System.out.println("process started...");
	 int c=a/b;									//throw new ArithmeticException()
	 System.out.println("Result has come..."+c);
 }
 catch(Exception e){
	 e.printStackTrace();
 }
 System.out.println("Process finished...");
 System.out.println("Thanks to visit...");
} 
}