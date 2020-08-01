/*LOCAL INNER CLASS:a class created within a method..*/
class Parent{
	public void show(){
		class Child{
			public void display(){
				System.out.println("I am Display of Child Class....\n");
			}
		}
		Child c1=new Child();
		c1.display();
	}
}
class LocalInnerDemo{
	public static void main(String ar[]){
		Parent p1=new Parent();
		p1.show();
	}
}