// super keyword as a object.

class A{
	int i=4;
	public void show()
	{
		System.out.println("A ka show()");
	}
}

class B extends A{
	int i=7;
	public void show()
	{
		super.show();										// A ka show() 
		System.out.println("B ka show() "+i);
		System.out.println("B ka show() "+super.i);			// if System.out.println("B ka show() "+i); => O/P: B ka show() 7
	}
}

class TestSuperOb{
	public static void main(String args[]){
		B obj=new B();
		obj.show();
	}
}

