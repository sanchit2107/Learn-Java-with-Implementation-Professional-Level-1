/*Variable Argument method(VAR Method)*/
/*Older Version will get Higher priority in comparision to New Version Method*/
class varArg{
	public void show(int x){
		System.out.println("Variable Argument integer demo....Old Version method introduce in jdk1.1......\n\n");
	}
public void show(int...x){
System.out.println("Variable Argument integer demo.....New Version Method introduce in jdk1.5......\n\n");	
}
public void show1(float...x){
System.out.println("Variable Argument float demo.....");	
}
}
class VarArgDemo{
	public static void main(String ar[]){
		varArg v1=new varArg();
		v1.show(5);
		v1.show(5,6,7);
		v1.show1();
		v1.show1(5.6f,6.5f);
	}
}