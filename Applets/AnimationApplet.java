import java.awt.*;
import java.applet.*;

/*<applet code=AnimateApplet.class width=500 height=500>
</applet>
*/
public class AnimateApplet extends Applet implements Runnable{
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
		g.setColor(c1);
		g.fillRect(80,90,180,60);
		g.setColor(c2);
		g.fillRect(90,100,110,40);
		g.setColor(Color.BLUE);
		g.drawString("THis is First Servlet",100,120);
	} 
}