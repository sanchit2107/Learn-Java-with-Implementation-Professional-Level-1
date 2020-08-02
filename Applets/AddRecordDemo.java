import java.sql.*;
import java.util.Scanner;

class AddRecordDemo{
  public static void main(String ar[]){
	  Scanner s1=new Scanner(System.in);
	  System.out.println("Enter enrollment no");
	   int eno=s1.nextInt();
	  System.out.println("Enter Student name");
	   String sn=s1.next();
	  System.out.println("Enter Course");
	   String course=s1.next();
	  System.out.println("Enter fee");
	   int fee=s1.nextInt();
	  Connection con=null;
	  try{
		  Class.forName("com.mysql.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost/")
	  }
  }
}