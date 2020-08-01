class Fir{
	void show1(){
		System.out.println("I am show of First Method....\n");
	}}
class Sec extends Fir{
	void show2(){
		System.out.println("I am show of Second Method...\n");
	}
}
class InheritanceDemo{
	public static void main(String ar[]){
		Sec s1=new Sec();
		s1.show1();
		s1.show2();
	}
}