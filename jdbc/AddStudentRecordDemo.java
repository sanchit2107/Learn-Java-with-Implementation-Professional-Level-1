import java.awt.*;
import java.awt.event.*;
import java.sql.*; 
import javax.swing.JOptionPane;

class AddStudentRecord implements ActionListener{
	Frame f1;
	Label l1,l2,l3,l4;
	TextField t1,t2;
	Checkbox cb1,cb2;
	CheckboxGroup cbg1;
	Button btn1,btn2;
	Choice ch1;
	
	public AddStudentRecord(){
		f1=new Frame;
		f1.setSize(500,500);
		
		l1=new Label("Enter Student Name");
		t1=new TextField();
		
		CheckboxGroup cbg1=new CheckboxGroup();
		cb1=new Checkbox("MALE",cbg1,true);
		cb2=new Checkbox("FEMALE",cbg1,false);
		
		l2=new Label("Select Qualification");
		ch1=new Choice;
		ch1.add("High School");
		ch1.add("Intermediate");
		ch1.add("Graduate");
		ch1.add("Post Graduate");
		
		
		
		
	}
}