package Strings;

public class StringFun {

	public static void main(String[] args) {
		String str1="Ankit";
		String str2="Badwaik";
		String str3="pranay";
		String str4="yash";
		String str5="";
		String str6=" ";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str5.isEmpty());
	
		System.out.println(str6.isEmpty());
		System.out.println(str1.charAt(3));
		System.out.println(str1.concat(str2));
		System.out.println(str1.endsWith("t"));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
	}

}
