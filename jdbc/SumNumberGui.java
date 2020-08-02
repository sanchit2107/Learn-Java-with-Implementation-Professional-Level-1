import java.awt.*;
import java.awt.event.*;
class SumGui implements ActionListener{
	Frame f1;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button btn1,btn2,btn3;
	public SumGui(){
		f1=new Frame();
		f1.setSize(500,500);
        
		l1=new Label("Enter First Number");
		t1=new TextField();
		
		l2=new Label("Enter First Number");
		t2=new TextField();
		
		btn1=new Button("ADD");
		btn2=new Button("CLEAR");
		btn3=new Button("EXIT");
		
		l3=new Label("Sum of two no are");
		
		f1.add(l1);
		f1.add(t1);
		
		f1.add(l2);
		f1.add(t2);
		
		f1.add(btn1);
		f1.add(btn2);
		f1.add(btn3);
		
		f1.add(l3);
		
		f1.setLayout(null);
		
		l1.setBounds(100,100,100,30);
		t1.setBounds(220,100,100,30);
		
		l2.setBounds(100,150,100,30);
		t2.setBounds(220,150,100,30);
		
		btn1.setBounds(120,200,100,30);
		btn2.setBounds(240,200,100,30);
		btn3.setBounds(150,240,130,30);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		l3.setBounds(100,300,200,30);
		
		f1.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==btn1){
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a+b;
				l3.setText("Sum of two nos. are="+c);
			}
			else if(e.getSource()==btn2){
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
			}
			else if(e.getSource()==btn3){
				System.exit(0);
			}
		}
}

class SumNumberGui{
	public static void main(String ar[]){
		new SumGui();
	}
}