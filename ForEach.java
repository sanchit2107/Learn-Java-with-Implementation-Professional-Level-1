import java.util.Scanner;
class ForEach{
public static void main(String ar[]){
Scanner s1=new Scanner(System.in);
int []x=new int[10];
System.out.println("enter array elements");
for(int i=0;i<10;i++)
	x[i]=s1.nextInt();
System.out.println("array elements are");
for(int p:x)
	System.out.print(p+" ");
}
}