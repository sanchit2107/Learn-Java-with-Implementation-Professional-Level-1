/*Inheritance*/
class Box{
private int length,width;
public void getData(int length,int width){
this.length=length;
this.width=width;	
}
public void showData(){
System.out.println("Lenghth is\t"+length+"\t Width is\t"+width);
}
public int getCal(){
	return length*width;
}
}
class ChildBox extends Box{
	private int height,volume;
	public void init(int a1,int a2,int a3){
		getData(a1,a2);
		height=a3;
	}
	public int calVolume(){
		volume=getCal()*height;
		return volume;
	}
	public void Display(){
		showData();
		System.out.println("Height is \t"+height+"\tVolume is\t"+volume);
	}
}
class InnDemo{
	public static void main(String ar[]){
		ChildBox c1=new ChildBox();
		c1.init(3,4,5);
		c1.calVolume();
		c1.Display();
		
	}
}