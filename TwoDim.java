//Jagged Array

import java.util.Random;
public class TwoDim
{
	public static void main(String args[])
	{
		int[][] a=new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];
		
		Random r=new Random();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=r.nextInt(100);
			}
			
		}
		
		System.out.println("Random elements in jagged array are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
				System.out.println(" ");
		}
	}
	
	
}