/*Sorting of Strings list*/
class StringSortDemo{
	public static void main(String ar[]){
		String s[]={"SUMIT","PUNEET","AMIT","RACHIT","MANEET"};
		System.out.println("\nOriginal list is\n");
		for(String k:s)
			System.out.print(k+" ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("\nSorted list is\n");
		for(String k:s)
			System.out.print(k+" ");
	}
}