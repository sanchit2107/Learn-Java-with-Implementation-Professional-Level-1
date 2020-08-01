interface A{
void show1();
}
interface B extends A{   //interface classes can inherited. 
	void show2();
}
interface C extends A,B{   //MULTIPLE INHERITANCE is possible with interface classes...
	void show3();
}
class follow implements C{      //class cannot inherited the interface class but it can "implements" the interface class....
public void show1(){
System.out.println("method of class A");
}
public void show2(){
System.out.println("method of class B");
}
public void show3(){
System.out.println("method of class c");
}}
class InterfaceInheritanceDemo{
public static void main(String ar[]){
follow f1=new follow();
f1.show1();
f1.show2();
f1.show3();
}
}