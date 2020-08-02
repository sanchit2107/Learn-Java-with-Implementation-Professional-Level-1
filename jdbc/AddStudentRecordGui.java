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
		f1=new Frame();
		f1.setSize(500,500);
		
		l1=new Label("Enter Student Name");
		t1=new TextField();
		
		CheckboxGroup cbg1=new CheckboxGroup();
		cb1=new Checkbox("MALE",cbg1,true);
		cb2=new Checkbox("FEMALE",cbg1,false);
		
		l2=new Label("Select Qualification");
		ch1=new Choice();
		ch1.add("High School");
		ch1.add("Intermediate");
		ch1.add("Graduate");
		ch1.add("Post Graduate");
		
		l3=new Label("Enter Student Address");
		t2=new TextField();
		
		btn1=new Button("ADD RECORD");
		btn2=new Button("EXIT");
		
		l4=new Label("WELCOME");
		
		f1.add(l1);
		f1.add(t1);
		
		f1.add(cb1);
		f1.add(cb2);
		
		f1.add(l2);
		f1.add(ch1);
		
		f1.add(l3);
		f1.add(t2);
		
		f1.add(l4);

		f1.add(btn1);
		f1.add(btn2);
		
		l1.setBounds(100,100,100,30);
		t1.setBounds(220,100,100,30);
		
		cb1.setBounds(100,150,100,30);
		cb2.setBounds(220,150,100,30);
		
		l2.setBounds(100,200,100,30);
		ch1.setBounds(220,200,100,30);
		
		l3.setBounds(100,300,100,30);
		t2.setBounds(220,300,100,30);
		
		l4.setBounds(100,350,200,30);
		
		btn1.setBounds(100,400,100,30);
		btn2.setBounds(230,400,100,30);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		String sn=t1.getText();
		String gender=null;
		if(cb1.getState()==true)
			gender="Male";
		else if(cb2.getState()==true)
			gender="Female";
		
		String qual=ch1.getSelectedItem();
		String addr=t2.getText();
		
		if(e.getSource()==btn1){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/studentdata?user=root&password=");
				PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
				
				ps.setString(1,sn);
				ps.setString(2,gender);
				ps.setString(3,qual);
				ps.setString(4,addr);
				
				int a=ps.executeUpdate();
				if(a==1){
					l4.setText("Record Added");
					JOptionPane.showMessageDialog(null,"RECORD ADDED");
					t1.setText("");
					t2.setText("");
				}
				else{
					l4.setText("Record could not be added");
					JOptionPane.showMessageDialog(null,"RECORD NOT ADDED");
				}
			}
			catch(Exception ee){
				l4.setText(" "+ee);
			}
		}
		else if(e.getSource()==btn2){
			System.exit(0);
		}
	}
}

class AddStudentRecordGui{
	public static void main(String ar[]){
		new AddStudentRecord();
	}
}