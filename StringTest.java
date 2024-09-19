package JavaPackage;

public class StringTest {

	public static void main(String[] args) {
		String a="Hello world";
		String b="aaaaa aaaaa";
		System.out.println(a.charAt(0));
		System.out.println(a.codePointAt(0));
		System.out.println(a.codePointBefore(1));
		System.out.println(a.codePointCount(4, 6));
		System.out.println(a.compareTo(b));
		System.out.println(a.concat(b));
		System.out.println(a.contains("lp"));
		System.out.println(a.contentEquals(b));
		System.out.println(a.contentEquals("Hello world"));
	}

}
