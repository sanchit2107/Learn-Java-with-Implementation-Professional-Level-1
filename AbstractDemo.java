abstract class RBI{                             //1.abstract class is a class in which few methods are given and few are not given..
public final void setFarmingRate(){            //2.this method is recommended and the rate for this method is fixed for all classes(banks)..
System.out.println("RBI farnming rate is 3%");
}
public abstract void setBusinessRate();          //3.these methods are compulsary and rate can be according to different classes..
public abstract void setHomeRate();             //4.not given methods.
}

class SBI extends RBI{							//5.class that will extends abstract class will responsible to override all the abstract method of its superclass.....if it fails to do so then this derived class will also have to be declared abstract.
public void setBusinessRate(){
System.out.println("sbi busuiness rate is 10%");	
}	public void setHomeRate(){
System.out.println("sbi home rate is 6.5%");
}
}

class PNB extends RBI{							//6.same as 5
public void setBusinessRate(){
System.out.println("pnb busuiness rate is 11%");	
}	public void setHomeRate(){
System.out.println("pnb home rate is 6%");
}}
6+9

class AbstractDemo{
public static void main(String ar[]){
RBI rbi;              //object of abstract class cannot be created  but its reference can be created..
SBI sbi=new SBI();
PNB pnb=new PNB();
System.out.println("pointing to sbi");
rbi=sbi;              //reference of sbi can be stored in rbi....
rbi.setBusinessRate();
rbi.setHomeRate();
rbi.setFarmingRate();
System.out.println("pointing to pnb");
rbi=pnb;             //refernce of pnb can be stored in pnb......
rbi.setBusinessRate();
rbi.setHomeRate();
rbi.setFarmingRate();		
}}