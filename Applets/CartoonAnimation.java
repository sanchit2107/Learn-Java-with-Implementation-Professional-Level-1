import java.awt.*;
import java.applet.*;

/*<applet code=CartoonAnimation.class width=500 height=500>
</applet>
*/
public class CartoonAnimation extends Applet implements Runnable{
	Thread t;
	Color c1,c2;
	int f;
	public void init(){
		c1=Color.RED;
		c2=Color.YELLOW;
		f=0;
		t=new Thread(this);
		t.start();
	}
	public void run(){
		while(true){
			if(f==0){
				c1=Color.RED;
				c2=Color.YELLOW;
				f=1;
			}
			else if(f==1){
				c1=Color.YELLOW;
				c2=Color.RED;
				f=0;
			}
			try
			{
			Thread.sleep(2000);
			}
			catch(Exception e){}
			repaint();
		}
	}
	public void paint(Graphics g){
		g.drawLine(100,80,140,280);
		g.drawLine(140,70,200,350);
		g.drawLine(200,60,250,400);
		g.drawLine(240,50,280,430);
	    g.drawLine(300,40,320,400);
		g.drawLine(340,30,350,400);
		g.drawLine(400,20,340,400);
		g.setColor(c1);
		g.fillArc(80,90,360,360,0,360);
		g.setColor(Color.BLACK);
		g.fillArc(150,220,50,50,0,360);
		g.setColor(Color.WHITE);
		g.fillArc(170,230,20,20,0,360);
        g.setColor(Color.BLACK);
		g.fillArc(300,220,50,50,0,360);
		g.setColor(Color.WHITE);
		g.fillArc(320,230,20,20,0,360);
		g.setColor(Color.BLUE);
		g.fillArc(225,350,50,50,0,-180);
		g.setColor(Color.PINK);
		g.fillRect(245,380,10,40);
	} 
}