import java.util.Scanner;
public class MatrixTranspose{
	public static void main(String ar[]){
		int[][] a= new int[10][10];
		int[][] b= new int[10][10];
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int rows = s1.nextInt();
		System.out.print("Enter Number of Columns : ");
		int columns = s1.nextInt();
		
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				a[i][j] = s1.nextInt();
		System.out.println("Matrix elements are as follows :");	
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
			System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}	

		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
			b[i][j]=a[j][i];
			}
		}	
		
		System.out.println("Elements After Transposition of Matrix are as follows:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
			System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}	
	}
}