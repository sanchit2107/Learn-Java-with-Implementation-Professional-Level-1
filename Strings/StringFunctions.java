class StringFuctions{
	public static void main(String ar[]){
		String s="IACT EDUCATION";
		System.out.println("Substring is\t"+s.substring(2,7));
		System.out.println("character at\t"+s.charAt(3));
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char p=s.charAt(i);
			if(p=='A'||p=='E'||p=='I'||p=='O'||p=='U')
				count++;
		}
		System.out.println("String starts with IACT\t"+s.startsWith("IACT"));
		System.out.println("No of vowels are\t"+count);
		System.out.println(s.concat("\tInstitue"));
	}
}