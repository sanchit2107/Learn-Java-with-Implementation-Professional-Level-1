/*STATIC BLOCK:Static block will be loaded at the time of class loading*/
/*Execution of Static Block*/
/*1.Identification of Static members from top to bottom*/
/*2.Execution of Static variable assignment & static block from top to bottom*/
/*3.Execution of Main Method*/ 

class StaticBlockDemo{
	static int i=20;
	static{
		m1();
		System.out.println("Static block 1...."+i+"\n");	//direct access....
	}
	public static void main(String ar[]){
		m1();
		System.out.println("Main Method.......\n");
	}
	public static void m1(){
		System.out.println("Value of j is"+j+"\n");  		//indirect access(read through method)....
	}
	static{
		System.out.println("Static Block 2.......");
	}
	static int j=10;
}

//if a variable is just initialized and original value not assigned variable is said to be read Indirectly Write Only State.
//if a variable read indirectly Write Only state it can be read Indirect only and it can't be read direct read operation.