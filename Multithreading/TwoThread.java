/*Working of two thread simultaneously*/
class CustomThread extends Thread{
			public CustomThread(String n){
			setName(n);
			start();
		}
		public void run(){
			for(int i=1;i<=5;i++){
				System.out.println(getName()+"\t is working.......");
			    try{
					Thread.sleep(2000);
				}
				catch(Exception e){}
			}
		}
		
	}
	class TwoThread{
		public static void main(String ar[]){
			Thread t=Thread.currentThread();
			CustomThread c1=new CustomThread("First Custom Thread");
			System.out.println("I am main method"+t.getName());				//it will get the default name i.e.,"main" therefore output of this line will be: I am main method main.
			t.setName("Main Thread");
			for(int i=1;i<=5;i++){
				System.out.println(t.getName()+"\t is working");
				try{
					Thread.sleep(2000);
				}
				catch(Exception e){}
			}
		}
	}
	
	
	/*OUTPUT:  I am main methodmain
First Custom Thread      is working.......
Main Thread      is working
First Custom Thread      is working.......
Main Thread      is working
First Custom Thread      is working.......
Main Thread      is working
First Custom Thread      is working.......
Main Thread      is working
First Custom Thread      is working.......
Main Thread      is working */