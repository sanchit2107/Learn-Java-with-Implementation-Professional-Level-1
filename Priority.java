// Priority will be given to exact match function

public class Priority{
	public static void main(String args[]){
		Display obj = new Display();
		obj.show(5.6f);
	}
}

class Display{
		public void show(float... a)
		{
			for(float x: a)
				System.out.print(x + " ");
		}
		public void show(float a)
		{
			System.out.println("Inside single args show");
		}
}
