interface AA1{
void m1();
}
interface AA2{
void m1();
}
class User implements AA1,AA2{				//class never extends but it will implements the interface........
public void m1(){
System.out.println("I am m1 method.....");
}
}
class InDemo{
public static void main(String ar[]){
User us=new User();
us.m1();
}
}