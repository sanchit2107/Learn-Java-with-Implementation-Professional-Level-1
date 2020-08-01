/* Flow of initializer block */
class Test{
int i=10;
{
m1();
System.out.println("First instance block....\n");
Test(){
m1();
System.out.println("Constructor.....\n")
}
public static void main(String ar[]){
	Test t1=new Test();
	System.out.println("I Am MAin Method.....\n");
}
	public void m1(){
		System.out.println("m1 Method...."+i"\t"+j"\n");
	}
	{
		System.out.println("Instance Block 2....")
	}
	int j=20;
}
}

/*OUTPUT*/
/*m1 Method....10	0*/
/*First instance block....*/
/*Instance Block 2....*/
/*m1 Method....10	20*/
/*Constructor*/
/*I Am MAin Method.....*/
