import java.util.Scanner;
public class InsertionSort{
	public static void main(String args[]){
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n=s.nextInt();
		int []a = new int [n];
		System.out.println("Enter Array:");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		
		//Logic for Insertion Sort
		
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int min=a[i];
			while( min<a[j] && j>=0 )
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=min;
		}
		
		System.out.println("Sorted Array is :");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

