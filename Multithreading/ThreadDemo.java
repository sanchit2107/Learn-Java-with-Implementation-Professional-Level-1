/*Multithreading*/
class ThreadDemo{
	public static void main(String ar[]){
		Thread t=Thread.currentThread();
		System.out.println("I am main method \t"+t.getName());			//it will get the default name i.e.,"main" therefore output of this line will be: I am main method main.
		t.setName("main thread");
		for(int i=1;i<=5;i++)
		{
			System.out.println(t.getName()+"\t is working");
			try{
				Thread.sleep(2000);
				}
			catch(Exception e)
			{}
		}

		}
}