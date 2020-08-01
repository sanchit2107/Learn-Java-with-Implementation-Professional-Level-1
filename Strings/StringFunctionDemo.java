class StringFunctionDemo{
public static void main(String ar[]){
	String a="iact education";
	String b="IACT EDUCATION";
	if(a.equals(b))
		System.out.println("Both Strings are equals");
	else
		System.out.println("Both Strings are not equals");
	
	if(a.equalsIgnoreCase(b))
		System.out.println("Both Strings are equals");
	else
		System.out.println("Both Strings are not equals");
	if(a.compareTo(b)>0)
		System.out.println("First String is greater than second");
		System.out.println("First String is greater than second");
	else if(a.compareTo(b)==0)
		System.out.println("Both Strings are equals");
	else
		System.out.println("Second String is greater than first");
}
}