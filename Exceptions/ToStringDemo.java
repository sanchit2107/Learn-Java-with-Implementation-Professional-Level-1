class Customer{
	private int cid;
	private String cname;
	public void getData(int cid,String cname){
		this.cid=cid;
		this.cname=cname;
	}
	public void showData(){
		System.out.println("Customer id is"+cid);
		System.out.println("Customer name is"+cname);
	}
	public String toString(){			//if this is not used then #code of refernce variable will be the output like (e.g.Customer@15db9742)
		return cid+" "+cname;
	}
}
class ToStringDemo{
	public static void main(String ar[]){
		Customer c1=new Customer();
		c1.getData(1184,"Sanchit");
		System.out.println(c1);			//use toString() method mentioned in line 12...overrided the info.. 
	}
}