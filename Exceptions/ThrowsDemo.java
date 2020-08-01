/*Use of throws:to pass the responsibility to JVM or to handle it ourself*/
/*if there is chance of raising Checked Exception then it is compulsary we should handle that checked exception otherwise we will get compile time error saying unreported exception & must be caught or declare to be thrown*/

class ThrowsDemo{
	public static void main(String ar[]) throws InterruptedException{
		for(int i=0;i<5;i++){
			Thread.sleep(2000);
			System.out.println(" "+i);
		}
	}
}