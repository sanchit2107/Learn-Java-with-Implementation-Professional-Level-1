import java.util.Scanner;
public class SelectionSort{
	public static void main(String ar[]){
		int []a=new int [5];
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n = s.nextInt();
		
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		
		System.out.println("Array elements are as:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		Sort ob=new Sort();
		ob.selection(a);
		
		System.out.println("Array after Sorting as follows:");
		printa ob2=new printa();
		ob2.printArray(a);
	}
}

class Sort{
	public void selection(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
}

class printa{
void printArray(int []a){
	int n=a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}