/* Inheritance Demo */
class Fir{												//super class
	void show1(){
		System.out.println("I am show of First Method....\n");
	}}
class Sec extends Fir{    		//Derived class or child class		//Sec class inherited Fir class..//
	void show2(){
		System.out.println("I am show of Second Method...\n");
	}
}
class InheritanceDemo{
	public static void main(String ar[]){
		//case 1
		System.out.println("Derived pointing to mits own object..\n");
		Sec s1=new Sec();		
		s1.show1();
		s1.show2();
		//case 2
		System.out.println("Super pointing to its own object..\n");
		Fir f1=new Fir();
		f1.show1();
		//case 3
		System.out.println("Super pointing to Derived object..\n");
		Fir f2=new Sec();
		f2.show();
		//case 4
		/*Sec ss=new fir(); it will give error i.e.,in the reference of derived class parent object cannot be store...
	}
}

/*Once the class inherited another class all the properties and methods of the super class either private,protected,public or default will be the part of the derived class but the private properties and methods of the super class are not accesible in the derived class...