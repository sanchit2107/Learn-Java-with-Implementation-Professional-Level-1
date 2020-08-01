import java.util.Scanner;
class TwoDArraySum{
public static void main(String ar[]){
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
Scanner s1=new Scanner(System.in);
System.out.println("Enter 1 matrix elements");
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
	a[i][j]=s1.nextInt();
System.out.println("Enter 2 matrix elements");
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
	b[i][j]=s1.nextInt();
System.out.println("1 matrix is.....\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++){
   System.out.print(a[i][j]+" ");
}	
 System.out.println("\n");
}
System.out.println("\n 2 matrix is.....\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++){
   System.out.print(b[i][j]+" ");
}	
 System.out.println("\n");
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++){
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("\n sum of 1 and 2 matrix is.....");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++){
   System.out.print(c[i][j]+"  ");
}	
 System.out.println("\n\n");
}
}}