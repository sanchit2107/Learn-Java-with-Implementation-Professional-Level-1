import java.util.Scanner;
public class EnterDataDisplay{
	public static void main(String args[]){
		String name;
		int age;
		long mobno;
		char gen;
		double per;
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Name :");
		name=s.nextLine();
		
		System.out.print("Enter Age :");
		age=s.nextInt();
		
		System.out.print("Enter mobile no. :");
		mobno=s.nextLong();
		
		System.out.print("Enter Gender :");
		gen=s.next().charAt(0);
		
		System.out.print("Enter 10th% :");
		per=s.nextDouble();
		
		System.out.println("Details are as follows\n\n");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Mobile No. :"+mobno);
		System.out.println("Gender :"+gen);
		System.out.println("10th Percentage :"+per);
	}
}