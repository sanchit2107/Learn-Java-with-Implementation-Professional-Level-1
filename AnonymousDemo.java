/*Anonymous Inner Class: a class has no name is known as anonymous inner class.it should be use if u have to override the method of class or interface ..*/
interface RBI{
	void setFarmingRate();
	void setHomeRate();
}
class AnonymousDemo{
	public static void main(String ar[]){
		RBI rbi=new RBI(){
			public void setFarmingRate(){
				System.out.println("Farming Rate is 4%\n");
			}
			public void setHomeRate(){
				System.out.println("Home Rate is 12%\n");
			}
		};
		rbi.setFarmingRate();
		rbi.setHomeRate();
	}
}