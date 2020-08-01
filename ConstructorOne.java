// Constructor

class ConstructorOne{
	public static void main(String args[]){
		Display obj = new Display();
		// obj.Display();  ----> error
	}
}

class Display{
	int i;
	public Display()
	{
		i=9;
		System.out.println("Value of i="+i);
	}
}