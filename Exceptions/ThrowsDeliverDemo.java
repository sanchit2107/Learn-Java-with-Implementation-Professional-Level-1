class ThrowsDeliverDemo{
	public static void main(String ar[]) throws InterruptedException{
		m1();
		System.out.println("main method...\n");
	}
	public static void m1() throws InterruptedException{
		m2();
		System.out.println("m1 methiod....\n");
	}
	public static void m2() throws InterruptedException{
		m3();
		System.out.println("m2 method...\n");
	}
	public static void m3() throws InterruptedException{
		Thread.sleep(2000);
	}
}