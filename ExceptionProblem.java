// BIG PROJECTS PROBLEMS:
// Problem1:   method(Button ob   OR    RadioButton ob     OR      CheckBox ob)
// Problem2:   premethod(Parent obj)
// Resolution of Problems:  Parent ref = new Child(); -> allowed in JAVA but its reverse is not True.

class ExceptionProblem{
	public static void main(String args[]){
		Parent ref;
		ref=new Child();
		ref.showParent();
		// ref.showChild();
		ref.show();
		Child refChild=(Child)ref;						// Type Casting
		refChild.showChild();
	}
}

class Parent{
	public void showParent(){
		System.out.println("Parent show()");
	}
	public void show()
	{
		System.out.println("Parent Here");
	}
}

class Child{
	public void showChild(){
		System.out.println("Child show()");
	}
	public void show()
	{
		System.out.println("Child Here");
	}
}