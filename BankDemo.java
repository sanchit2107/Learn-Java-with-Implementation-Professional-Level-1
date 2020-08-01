import java.util.Scanner;
class Bank{
private int acno,balance;
private String cname,actype;
Scanner s1=new Scanner(System.in);
public void openAccount(){
System.out.println("Enter ac no");
acno=s1.nextInt();	
System.out.println("Enter customer name");
cname=s1.next();	
System.out.println("Enter ac type");
actype=s1.next();	
balance=50000;
}
public void depositMoney(int amt){
balance=balance+amt;
System.out.println("Amount Deposited and ur current balance is\t"+balance);	
}
public void withdrawMoney(int amtt){
	if(balance>amtt)
	{
balance=balance-amtt;
System.out.println("amount withdrawn and ur current balance is\t"+balance);
}
else 
	System.out.println("Not sufficient Fund");
}
public void balanceEnquiry(){
System.out.println("ac no is"+acno);
System.out.println("Customer name is"+cname);
System.out.println("acount type is"+actype);
System.out.println("current balance is"+balance);
System.out.println("\n======================================\n");
}
}
class BankDemo{
public static void main(String ar[]){
	Scanner s1=new Scanner(System.in);
Bank b1=new Bank();
int k=0;
do{
System.out.println("1.Open Account");
System.out.println("2.Deposit Money");
System.out.println("3.Withdraw Money");
System.out.println("4.Balance Enquiry");	
System.out.println("5.Exit");
System.out.println("Enter ur choice");
int ch=s1.nextInt();
switch(ch){
case 1:b1.openAccount();
	 break;
case 2:System.out.println("Enter amount to be deposited");
int amt=s1.nextInt();
b1.depositMoney(amt);
break;
case 3:System.out.println("Enter amount to be withdrawn");
int amtt=s1.nextInt();
b1.withdrawMoney(amtt);
break;
case 4:b1.balanceEnquiry();
break;
case 5:System.exit(0);
default:System.out.println("Invalid choice");
}}while(k!=1);
}
}
