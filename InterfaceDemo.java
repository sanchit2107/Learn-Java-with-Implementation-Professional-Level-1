interface RBII{
void setFarmingRate();  //all the methods are abstract in interface class
void setBusinessRate();
void setHomeRate();	
}
class PNBI implements RBII{  //class will not inherited(extends) interface class but it will implements the interface class....
public void setFarmingRate(){
System.out.println("pnb Farming rate is 6%");	
}
public void setBusinessRate(){
System.out.println("pnb Business rate is 12%");
}
public void setHomeRate(){
System.out.println("pnb home rate is 11%");
}}
class SBII implements RBII{    //class will not inherited(extends) interface class but it will implements the interface class....
public void setFarmingRate(){
System.out.println("sbi Farming rate is 4%");	
}
public void setBusinessRate(){
System.out.println("sbi business rate is 11%");
}
public void setHomeRate(){
System.out.println("sbi Home rate is 12.5%");
}}
class InterfaceDemo{
public static void main(String ar[]){
RBII rbi;//since object of interface class cannot be created....but its reference(i.e. RBII rbi) can be created...
PNBI pnb=new PNBI();
SBII sbi=new SBII();
System.out.println("pointing to..pnb...");
rbi=pnb;  //refrence of pnb object can be stored in rbi. 
rbi.setBusinessRate();
rbi.setFarmingRate();
rbi.setHomeRate();
System.out.println("pointing to..sbi...");
rbi=sbi;  //refernce of sbi can be stored in rbi.
rbi.setBusinessRate();
rbi.setFarmingRate();
rbi.setHomeRate();
}}



