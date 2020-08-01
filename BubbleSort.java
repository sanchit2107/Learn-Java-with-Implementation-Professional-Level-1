import java.util.Scanner;
public class BubbleSort{
	public static void main(String ar[]){
		int[] a= new int[5];
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n= s1.nextInt();
		System.out.println("Enter Array elements:");
		for(int i=0;i<n;i++)
			a[i]=s1.nextInt();
		
		for(int p=0;p<n-1;p++)
		{
			for(int s=0;s<n-p-1;s++)
			{
				if(a[s] > a[s+1])
				{
					int temp;
					temp=a[s];
					a[s]=a[s+1];
					a[s+1]=temp;
				}
			}
		}
		System.out.println("Array after Sorting as follows :");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}