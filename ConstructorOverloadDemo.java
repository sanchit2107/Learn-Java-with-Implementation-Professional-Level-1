/*Constructor Overloading */
class ABC{
	private int a,b;
	public ABC(int x,int y){
		a=x;
		b=y;
		System.out.println("Two Integer parameter constructor....\n");
	}
	public ABC(int n){
		a=n;
		b=n;
		System.out.println("One integer parameter Constructor...\n");
	}
	public ABC(ABC a1){
		a=a1.a;
		b=a1.b;
		System.out.println("Object as a parameter Constructor....\n");
	}
	public void showData(){
		System.out.println(a+"\t"+b);
	}
}
class ConstructorOverloadDemo{
	public static void main(String ar[]){
		ABC aa= new ABC(44,55);
		ABC ab= new ABC(55);
		ABC cc= new ABC(ab);
		ABC aaa= new ABC(new ABC(55,44));
	}
}