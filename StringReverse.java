package javapackage;

public class StringReverse {

	public static void main(String[] args) {
		String a="Terra firma";
		System.out.println(reverse(a));
	}
	public static String reverse(String in) {
		if (in==null) {
			throw new IllegalArgumentException ("Null is not validinput");
		}
		StringBuilder out =new StringBuilder();
		char[] chars= in.toCharArray();
		for (int i=chars.length-1; i>=0;i--) {
			out.append(chars[i]);
		}
		return out.toString();
	}
}
