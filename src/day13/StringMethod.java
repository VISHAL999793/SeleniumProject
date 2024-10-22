package day13;

public class StringMethod {
	public static void main(String[] args) {		
		String name =  "0b 38";
		String name2 =  "b 38";
		String name3= "ram";
		String name4= "";
		String name5= "SundAr";
		String name6= "sundar";
		System.out.println(name.length());		
		System.out.println(name.charAt(1));		
		System.out.println(name.concat(" Noida"));
		System.out.println(name.contains("380"));
		System.out.println(name.endsWith("4"));
		System.out.println(name.equals(name2));
		System.out.println(name3.toLowerCase());
		System.out.println(name3.toUpperCase());
		String ex = name3.replace("ram", "Hello");
		System.out.println(ex);
		System.out.println(name4.isEmpty());
		System.out.println(name.trim());
		System.out.println(name5.equalsIgnoreCase(name6));
		System.out.println(name5.equals(name6));
	}

}
