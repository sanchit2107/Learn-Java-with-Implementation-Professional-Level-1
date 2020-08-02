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
		  con=DriverManager.getConnection("jdbc:mysql://localhost/javaprograms?user=root&password=");
		  String qry="insert into student values(?,?,?,?)";
		  PreparedStatement ps=con.prepareStatement(qry);
		  ps.setInt(1,eno);
		  ps.setString(2,sn);
		  ps.setString(3,course);
		  ps.setInt(4,fee);
		  
		  int a=ps.executeUpdate();
		  if(a==1)
			  System.out.println("record added");
		  else 
			  System.out.println("record not added");
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
		  finally{
			  try{
				  con.close();
			  }
			  catch(Exception e){
				  System.out.println(e);
			  }
		  }
  }
}