import java.util.Scanner;
class JaggedDemo{
public static void main(String []ar){
Scanner s1=new Scanner(System.in);
int x[][]=new int[5][];
x[0]=new int[4];
x[1]=new int[5];
x[2]=new int[2];
x[3]=new int[3];
x[4]=new int[4];
System.out.println("Enter Jagged Matrix Elements\n\n");
for(int i=0;i<x.length;i++)
for(int j=0;j<x[i].length;j++)
	x[i][j]=s1.nextInt();
System.out.println("\nJagged Matrix is\n\n");
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]+" ");
}
System.out.println("\n");
}
}
}