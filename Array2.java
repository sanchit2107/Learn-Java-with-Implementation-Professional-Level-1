//Passing 1-D array to another method

public class Array2
{
public static void main(String args[])
{
int[] a={1,2,3,45,12};
ArrayFunc obj=new ArrayFunc();
obj.findMin(a);	
}

}


class ArrayFunc
{
public void findMin(int a[])
{
int chota=a[0];
for(int i=1;i<a.length;i++)
{
	if(a[i]<chota)
		chota=a[i];
}
System.out.println("Smallest element in array="+chota);
}}