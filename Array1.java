import java.util.Scanner;
public class Array1{
public static void main(String ar[]){
  //int arr[]={1,2,3,4,5};
  int[] arr = new int[5];
  Scanner s = new Scanner(System.in);
  for(int j=0;j<arr.length;j++)
  {
	arr[j]=s.nextInt();  
  }
  for(int i=0;i<arr.length;i++)
     System.out.print(arr[i]+" ");
   }
   }