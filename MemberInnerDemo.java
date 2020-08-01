/*Member Inner Class*/
class Outer{
private String message;
class Inner{
public void show(){
message="Demo of Inner Class";
System.out.println("SHOW OF INNER CLASS...."+message);
}
} 
}
class MemberInnerDemo{
public static void main(String ar[]){
Outer oo=new Outer();
Outer.Inner in=oo.new Inner();
in.show();
}
}