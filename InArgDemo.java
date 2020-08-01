/*If 2 classes contain methods with same name but different type of arguments then the implemented class has to give the implementation of both the methods...*/
interface left{
public void m1();
}
interface right{
public void m1(int i);
}
class Test implements left,right{
	public void m1(){
		System.out.println("Without Argument....\n");
	}
	public void m1(int i){
		System.out.println("With Argument....");
	}
}
class InArgDemo{
public static void main(String ar[]){
	Test t1=new Test();
	t1.m1();t1.m1(5);
}
}