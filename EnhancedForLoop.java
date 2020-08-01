//for each loop(or Enhanced for loop):all elements are printed
import java.util.Scanner;
public class EnhancedForLoop{
	public static void main(String args[]){
		System.out.print("Enter no of elements:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Elements are as follows:");
		for(int x: a)
			System.out.print(x+" ");
	}
}

