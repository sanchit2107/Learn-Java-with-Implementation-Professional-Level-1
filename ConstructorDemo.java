/*Constructor*/
class emp{
 private int eno,sal;
 private String ename,dname;
 public emp(int eno,int sal,String ename,String dname){				//Constructor:way to initialize the variables....Constructor is only used for initialization.
	this.eno=eno;
    this.sal=sal;
	this.ename=ename;
	this.dname=dname;
 }
 public void showData(){
	 System.out.println("Employee no is\t"+eno);
	 System.out.println("Employee name is\t"+ename);
	 System.out.println("Employee salary is\t"+sal);
	 System.out.println("Employee department is\t"+dname);
 }
}
class ConstructorDemo{
	public static void main(String ar[]){
		emp e1=new emp(1,20000,"Sanchit","Accounts");
		emp e2=new emp(2,30000,"Vatsal","HR");
		e1.showData();
		e2.showData();
	}
}