// Class Pattern
class Pattern{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(i==0 || i==3)
					System.out.print("*");
				else
				{					
					if(j==0 || j==3)
					System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			
			System.out.println("");
			
		}
	}
}