import java.util.Random;
public class JaggedSum{
	public static void main(String ar[]){
		int[][] a= new int[3][];
		int[][] b= new int[3][];
		int[][] c= new int[3][];
		
		a[0]= new int[3];
		a[1]= new int[2];
		a[2]= new int[4];
		
		b[0]= new int[3];
		b[1]= new int[2];
		b[2]= new int[4];
		
		Random r1= new Random();
		Random r2= new Random();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=r1.nextInt(100);
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=r2.nextInt(1000);
			}
		}
		
		System.out.println("1st Jagged Matrix is as follows :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("2nd Jagged Matrix is as follows :");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
			//Addition of 2 Jagged Matrix 
		System.out.println("");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=0;
				c[i][j]=c[i][j]+a[i][j]+b[i][j];
			}
		}

		
		System.out.println("Sum of two Jagged Matrix are as follows :");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	}
}