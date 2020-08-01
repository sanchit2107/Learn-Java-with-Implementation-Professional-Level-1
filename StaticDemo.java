class ABC{
int a,b;
static int n;
public void show(){
	System.out.println("I am show Method.......\n");
}
public static void show1(){
	System.out.println("I am show1 Method......\n");
}
}
class StaticDemo{
	public static void main(String ar[]){
		ABC a1= new ABC();
		ABC a2=new ABC();
		a1.show();
		a2.show1();
		ABC.show1();			//static members are associated with class and they will access by classname.membername......
	}
	}