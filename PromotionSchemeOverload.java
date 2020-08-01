/*Promotion Scheme in Overloading*/
class Shape{
	public void draw(){
		System.out.println("\nWithout argument.....\n");
	}
	public void draw(int a){
		System.out.println("\nOne Integer argument.....\n");
	}
	/*public void draw(int a,int b){								//exact matched method is having higher priority for Promotion Scheme in overloading.........
		System.out.println("\nTwo Integer argument.....\n");
	}*/
	public void draw(String a){
		System.out.println("\nOne String type argument......\n");
	}
	public void draw(Shape s){
		System.out.println("\nObject type argument.....\n");
	}
	public void draw(int x,float y){
		System.out.println("\nOne integer and one float argument\n");
	}
	/*public void draw(float x,int y){
		System.out.println("\nOne float and one integer argument\n");
	}*/
	public void draw(float s,float w){
		System.out.println("\nBoth float argument.....\n");
	}
}
class PromotionSchemeOverload{
	public static void main(String ar[]){
		Shape s1=new Shape();
		s1.draw();
		s1.draw(44);
		s1.draw(5,6);
		s1.draw("abc");
		s1.draw(56.3f,56);
		s1.draw(5.6f,65.5f);
		Shape s2=new Shape();
		s2.draw(s1);
	}}