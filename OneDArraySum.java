import java.util.Scanner;
class OneDArraySum{
public static void main(String ar[]){
int x[]=new int[10];
int s=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter array elements");
for(int i=0;i<x.length;i++){
	x[i]=s1.nextInt();
	s+=x[i];
}
System.out.println("Sum of All elements of one D array =\t"+s);
}
}