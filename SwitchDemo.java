import java.util.Scanner;
class SwitchDemo{
public static void main(String ar[]){
System.out.println("Main Menu\n");
System.out.println("1.Odd/Even\n");
System.out.println("2.Greater\n");
System.out.println("3.Swapping\n");
System.out.println("4.Exit\n");
Scanner s1=new Scanner(System.in);
System.out.println("Enter ur Choice");
int ch=s1.nextInt();
int k=0;
do{
switch(ch){
case 1:
System.out.println("Enter any number");
int c=s1.nextInt();
if(c%2==0)
System.out.println("Even number");
else
	System.out.println("Odd number");
break;
case 2:System.out.println("enter values of a and b");
int a=s1.nextInt();
int b=s1.nextInt();
if(a>b)
	System.out.println("a is greater");
else
	System.out.println("b is greater");
break;
case 3:
System.out.println("enter two numbers");
int x=s1.nextInt();
int y=s1.nextInt();
int C;
System.out.println("numbers before swapping are\t"+x+y);
C=x;
x=y;
y=C;
System.out.println("numbers after swapping are\t"+x+y);
break;
case 4:System.exit(0);
}}while(k!=1);
}}
