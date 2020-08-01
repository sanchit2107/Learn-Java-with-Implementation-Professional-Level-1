class StringDemo{
	public static void main(String ar[]){
		String a="iact education";			//by STRING LITERALS:object will be created in pool area(in pool area no duplicate object will be created if two strings are are same then their reference will be same).
        String b="iact education";
		if(a==b)
			System.out.println("Objects are equal");
		else
			System.out.println("Objects are not equal");
		String a1=new String("iact education");			//by "new" keyword:object will be created in Heap area(in heap area always new object will be created each time).
		String b1=new String("iact education");			//therefore a1 and b1 will get differnt refernce.so a1 and b1 are not equal.
		if(a1==b1)
			System.out.println("Objects are equal...");
		else
			System.out.println("Objects are not equal...");
	}
}