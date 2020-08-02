import java.sql.*;
import java.util.Scanner;

class BankApplicationDemo{
    static Connection con;
    static Scanner s1=new Scanner(System.in);
	public static Connection giveConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");			//load the driver
			con=DriverManager.getConnection("jdbc:mysql://localhost/bank?user=root&password=");
			return con;
		}
		catch(Exception e){
			return null;
		}
	}
	
	//case 1:
	public static void openAccount(){
			System.out.println("\nEnter customer name");
			String cname=s1.next();	
			System.out.println("\nEnter ac type");
			String actype=s1.next();	
			int balance=5000;
			try{
				con=giveConnection();
				String qry="insert into customer(cname,actype,balance) values(?,?,?)";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setString(1,cname);
				ps.setString(2,actype);
				ps.setInt(3,balance);
				int a=ps.executeUpdate();
					if(a==1){
						System.out.println("\nAccount sucessfully opened...\n");
						System.out.println("Thanks for visit\n");
						}
					else 
						System.out.println("Account not opened\n");
			}
			catch(Exception e){
								System.out.println(e);
			}
	}
	
	
	//case 2:
	public static void depositMoney(){
			System.out.println("\nEnter Account Number");
			int acno=s1.nextInt();
			System.out.println("\nEnter Amount to be deposited");
			int amt=s1.nextInt();
			try{
				con=giveConnection();
				String qry="update customer set balance=balance+? where acno=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setInt(1,amt);
				ps.setInt(2,acno);
				int a=ps.executeUpdate();
					if(a==1)
							System.out.println("Ammount Deposited\n");
					else
							System.out.println("Amount not Deposited\n");
			}
			catch(Exception e){
							System.out.println(e);
			}
	}
	
	
	//case 3:
	public static void withdrawMoney(){
			System.out.println("\nEnter Account Number");
			int acno=s1.nextInt();
			System.out.println("\nEnter Ammount to be Withdrawn");
			int amt=s1.nextInt();
			try{
				con=giveConnection();
				String qry="update customer set balance=balance-? where acno=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ps.setInt(1,amt);
				ps.setInt(2,acno);
				int a=ps.executeUpdate();
					if(a==1)
							System.out.println("Amount Withdrawn\n");
					else
							System.out.println("Amount not withdrawn\n");
			}
			catch(Exception e){
							System.out.println(e);
			}
	}
	
	
	//case 4:
	public static void balanceEnquiry(){
			System.out.println("\nEnter Account Number");
			int acno=s1.nextInt();
				try{
					con=giveConnection();		
					String qry="select * from customer where acno=?";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setInt(1,acno);
					ResultSet rs=ps.executeQuery();
						if(rs.next()){
								String cn=rs.getString(2);
								String act=rs.getString(3);
								int bal=rs.getInt(4);
								System.out.println("\nCustomer Name is "+cn);
								System.out.println("\nAccount type is"+act);
								System.out.println("\nBalance is"+bal+"\n");
						}
						else 
								System.out.println("\nAccount Record not Found\n");
				}
				catch(Exception e){
					System.out.println(e);
				}
	}
	
	//case 5:
	public static void displayAll(){
				try{
					con=giveConnection();
					String qry="select * from customer";
					PreparedStatement ps=con.prepareStatement(qry);
					ResultSet rs=ps.executeQuery();
					ResultSetMetaData rsm=rs.getMetaData();
					System.out.println("\n=============================================\n");
						for(int i=1;i<=rsm.getColumnCount();i++)
								System.out.print(rsm.getColumnName(i)+"\t");
								System.out.println("\n=============================================\n");
							while(rs.next()){
								int ano=rs.getInt(1);
								String cn=rs.getString(2);
								String at=rs.getString(3);
								int bal=rs.getInt(4);
								System.out.println(ano+"     "+cn+"    "+at+"      "+bal);
					
							}
				}
				catch(Exception e){
					System.out.println(e);
				}
	}
	
	//case 6:
	public static void closeAccount(){
		System.out.println("\nEnter Account Number");
		int acno=s1.nextInt();
				try{
					con=giveConnection();
					String qry="delete from customer where acno=?";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setInt(1,acno);
					int a=ps.executeUpdate();
						if(a==1)
							System.out.println("Account Closed..\n");
						else 
							System.out.println("Account not Close..\n");
				}
				catch(Exception e){
					System.out.println(e);
				}
	}
	
	
	public static void main(String ar[]){
		int k=0;
		do{
			System.out.println("\n1.Open Account\n");
			System.out.println("2.Deposit Money\n");
			System.out.println("3.Withdraw Money\n");
			System.out.println("4.Balance Enquiry\n");
			System.out.println("5.Display all\n");
			System.out.println("6.Close Account\n");
			System.out.println("7.Exit\n");
	
			System.out.println("\nEnter ur choice");
			int ch=s1.nextInt();
			switch(ch){	
				case 1: openAccount();
						break;
				case 2: depositMoney();
						break;
				case 3: withdrawMoney();
						break;
				case 4: balanceEnquiry();
						break;
				case 5: displayAll();
						break;
				case 6: closeAccount();
						break;
				case 7:System.exit(0);
				default:System.out.println("Invalid choice\n");
			}
			System.out.println("\nDo u want to cont...press 1 for no");
			k=s1.nextInt();
		}while(k!=1);
			
	}
}

//By Sanchit Singhal..........