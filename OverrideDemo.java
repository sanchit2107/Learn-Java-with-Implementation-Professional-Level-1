class RBI{
public final void setFarmingRate(){
System.out.println("Farming Rate is 4%\n");
}
public void setHomeRate(){
System.out.println("RBI Home Rate is 10%\n");
}
public void setBusinessRate(){
System.out.println("RBI Business Rate is 11%\n");
}
} 
class SBI extends RBI{
public void setHomeRate(){
System.out.println("SBI Home Rate is 12%\n");
}
public void setBusinessRate(){
System.out.println("SBI Business Rate is 13%\n");
}
public void setEducationRate(){
System.out.println("SBI Education Rate is 10.5%\n");
}
} 
class PNB extends RBI{
public void setHomeRate(){
System.out.println("PNB Home Rate is 11%\n");
}
public void setBusinessRate(){
System.out.println("PNB Business Rate is 12%\n");
}
public void setEducationRate(){
System.out.println("PNB Education Rate is 12.5%\n");
}
public void setConstructionRate(){
System.out.println("PNB Construction Rate is 13%\n");
} 
}
class OverrideDemo{
	public static void main(String ar[]){
		RBI rb;
		RBI rbi=new RBI();
		SBI sbi=new SBI();
		PNB pnb=new PNB();
		System.out.println("Pointed to its own reference...\n");
		rb=rbi;
		rb.setFarmingRate();
		rb.setBusinessRate();
		rb.setHomeRate();
		System.out.println("Pointed to sbi reference...\n ");
		rb=sbi;
		rb.setFarmingRate();
		rb.setBusinessRate();
		rb.setHomeRate();
		System.out.println("Pointed to pnb reference...\n ");
		rb=pnb;
		rb.setFarmingRate();
		rb.setBusinessRate();
		rb.setHomeRate();
	}
}
