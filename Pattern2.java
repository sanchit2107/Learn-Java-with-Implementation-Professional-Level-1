class Pattern2{
	public static void main(String args[]){
		int i,j,c=1;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
					System.out.print(c+" ");
					c=c+1;
					if(c == 5)
						c=1;
			}
			c=1+c;
			System.out.println();
		}
	}
}