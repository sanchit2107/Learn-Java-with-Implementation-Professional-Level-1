// ANONYMUS OBJECT : which cannot be further used in our program.
class Sum{
	public int CalSum(int a,int b){
		return (a+b);
	}
}

public class AnonymusObj{
	public static void main(String args[]){
		System.out.println(new Sum().CalSum(4,5));
	}
}