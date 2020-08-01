import java.util.Scanner;
public class CheckSenior{
	public static void main(String ar[]){
		/*Scanner s1=new Scanner(System.in);
		System.out.print("Enter Age of 1st Person:");
		int a=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.print("Enter Age of 2nd Person:");
		int b=s2.nextInt();*/
		FindAge obj1=new FindAge();
		obj1.age=25;
		FindAge obj2=new FindAge();
		obj2.age=61;
		obj1.findMax();
		obj2.findMax();
	}
}

class FindAge{
		int age;
		public void findMax(){
				if(age >= 60)
				System.out.println("Senior Citizen");
				else
				System.out.println("Not a Senior Citizen");
			}
	}
