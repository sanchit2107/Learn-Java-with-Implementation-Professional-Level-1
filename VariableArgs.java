//Passing variable number of Arguments

public class VariableArgs{
	public static void main(String args[]){
		Display obj = new Display();
		obj.show(5.6f,6.7f,9.22f,5);
	}
}

class Display{
		public void show(float... a, int... b)
		{
			for(float x: a)
				System.out.print(x + " ");
		}
}