/*Initializer Block:initializer block is always executed whenever we create the object of the class & it is executed before constructor...*/
class Emp{
private int empno,sal;
private String ename,dname;
{
	empno=1;
	sal=20000;
	ename="Sanchit";
	dname="HR";
}	
public void showData(){
	System.out.println("Employee no is\t"+empno);
	System.out.println("Employee name is\t"+ename);
	System.out.println("Employee salary is\t"+sal);
	System.out.println("Employee department is\t"+dname);
}
}
class InitializerBlockDemo{
	public static void main(String ar[]){
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.showData();
		e2.showData();
	}
}