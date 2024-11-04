package testing;

public class LengthOfString {

	public static void main(String[] args) {
		String a="Hello World!";
		int length=0;
		for (char c:a.toCharArray()) {
			length++;
		}
		System.out.println("Length of \"" + a + "\" is " + length);
	}

}
