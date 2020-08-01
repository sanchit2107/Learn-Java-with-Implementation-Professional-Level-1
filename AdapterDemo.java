/*Adapter Class*/
/*Adapter class is trick that a programmer can adopt to implement interface*/
/*It is highly recommended to declare "adapter" class as "abstract"*/
interface MyInterface{
void show1();
void show2();
void show3();
void show4();
void show5();
void show6();
void show7();	
}
abstract class A1class implements MyInterface{
public void show1(){}
public void show2(){}
public void show3(){}
public void show4(){}
public void show5(){}
public void show6(){}
public void show7(){}
}
class AdClass extends A1class{
	public void show1(){
		System.out.println("demo of adapter show 1.....\n");
	}
	public void show2(){
		System.out.println("demo of adapter show 2.....\n");
	}
}
class AdapterDemo{
	public static void main(String ar[]){
		AdClass aa=new AdClass();
		aa.show1();
		aa.show2();
	}
}