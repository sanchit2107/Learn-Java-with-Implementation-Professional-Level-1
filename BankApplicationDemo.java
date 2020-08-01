import java.sql.*;
import java.util.Scanner;

class BankDemo{
	private int acno,balance;
    private String cname,actype;
    Scanner s1=new Scanner(System.in);
	Connection con;
	public Connection giveConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");			//load the driver
			con=DriverManager.getConnection("jdbc:mysql://localhost/bank?user=root&password=");
			return con;
		}
		catch(Exception e){
			return null;
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
	public void openAccount(){
		System.out.println("Enter account no");
		acno=s1.nextInt();	
		System.out.println("Enter customer name");
		cname=s1.next();	
		System.out.println("Enter ac type");
		actype=s1.next();	
		System.out.println("Enter balance");
		balance=s1.nextInt();	
		
		con=giveConnection();
		String qry="insert into customer values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(qry);
		ps.setInt(1,acno);
		ps.setString(2,cname);
		ps.setString(3,actype);
		ps.setInt(4,balance);
		int a=ps.executeUpdate();
		 if(a==1){
			 System.out.println("Account sucessfully opened...");
		     System.out.println("Thanks for visit");
            }
			else 
			  System.out.println("Account not opened");
    }
	
}


class BankApplicationDemo{
	public static void main(String ar[]){
		Scanner s1=new Scanner(System.in);
		BankDemo b1=new BankDemo();
		int k=0;
do{
System.out.println("1.Open Account");
System.out.println("2.Deposit Money");
System.out.println("3.Withdraw Money");
System.out.println("4.Balance Enquiry");
System.out.println("5.Display all");
System.out.println("6.Transfer Money");
System.out.println("7.Close Account");	
System.out.println("8.Exit");
System.out.println("Enter ur choice");
int ch=s1.nextInt();
switch(ch){
case 1:b1.openAccount();
	 break;
case 8:System.exit(0);
default:System.out.println("Invalid choice");
}}while(k!=1);
			
	}
}