class MyClass{
private int a,b;
public void getdata(int a,int b){
this.a=a;							//for m1:m1.a=a and m2:m2.a=a.....when any object wants to point itself it will use this pointer...
this.b=b;
}
public void showdata(){
System.out.println(a+"\t"+b);
}
}
class ThisDemo{
public static void main(String arp[]){
MyClass m1,m2;
m1=new MyClass();
m2=new MyClass();
m1.getdata(44,55);				//value of data members can also be pass from the main method......
m2.getdata(55,66);
m1.showdata();
m2.showdata();
}
}