/*Return an object from Main Method*/
class Time1{
private int hours;
public void getData(int hours){
	this.hours=hours;
}
public void showData(){
	System.out.println("\n\nHours is"+hours);
}
public Time1 greater(Time1 n1){
	if(hours>n1.hours)
		return this;
	else
		return n1;
}
}
class ReturnObject{
	public static void main(String ar[]){
		Time1 t1,t2,t3;
		t1=new Time1();
		t2=new Time1();
		t3=new Time1();
		t1.getData(40);
		t2.getData(50);
		t3=t1.greater(t2);
		t1.showData();
		t2.showData();
        t3.showData();
		}
}