// super keyword as method

class Parent{
	public Parent()
	{
		System.out.println("Default Cons.");
	}
	public Parent(int i)
	{
		System.out.println("Paremetrized Cons.");
	}
}

class Child extends Parent{
	public Child()
	{
		System.out.println("Default Cons.");
	}
	public Child(int x)
	{
		System.out.println("Paremetrized Cons.");
	}
}

class TestSuperMethod{
	public static void main(String args[])
	{
		Parent o1=new Parent();
		Parent o2=new Parent(4);
		Child o3=new Child();		// IMPORTANT**
		Child o4=new Child(10);		//VERY IMPORTANT****
	}
}