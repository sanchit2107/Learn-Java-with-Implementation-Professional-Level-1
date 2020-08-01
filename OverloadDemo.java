            /*METHOD OVERLOADING*/
class Shape{
	public void draw(){
		System.out.println("Without argument.....\n");
	}
	public void draw(int a){
		System.out.println("One Integer argument.....\n");
	}
	public void draw(int a,int b){
		System.out.println("Two Integer argument.....\n");
	}
	public void draw(String a){
		System.out.println("One String type argument......\n");
	}
	public void draw(Shape s){
		System.out.println("Object type argument.....\n");
	}
}
class OverloadDemo{
	public static void main(String ar[]){
		Shape s1=new Shape();
		s1.draw();
		s1.draw(44);
		s1.draw(5,6);
		s1.draw("abc");
		Shape s2=new Shape();
		s2.draw(s1);
	}}