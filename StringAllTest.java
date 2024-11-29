package testing;

public class StringAllTest {

	public static void main(String[] args) {
		
		String a="test";
		System.out.println("Length of string");
		System.out.println(a.length());
		System.out.println("Character at 3rd location");
		System.out.println(a.charAt(3));
		System.out.println("find string in string");
		System.out.println(a.contains("e"));
		System.out.println("Concatenate");
		System.out.println(a.concat(" wow"));
		System.out.println("find empty string");
		System.out.println(a.isEmpty());
		System.out.println("Compare");
		System.out.println(a.compareTo("Test"));
		System.out.println("Compare ignore case");
		System.out.println(a.compareToIgnoreCase("Test"));
		System.out.println("Equals");
		System.out.println(a.equals("Test"));
		System.out.println("Equals ignore case");
		System.out.println(a.equalsIgnoreCase("Test"));
		System.out.println("Compare");
		System.out.println(a.compareTo("test"));
		System.out.println("Contains");
		System.out.println(a.contentEquals("test"));
		System.out.println("hash code");
		System.out.println(a.hashCode());
		System.out.println("Char array");
		System.out.println(a.toCharArray()[1]);
		System.out.println("Index");
		System.out.println(a.indexOf('t', 1));
		System.out.println("Append");
		a=a+'d';
		System.out.println(a);
		StringBuilder sb=new StringBuilder();
		//sb=a;
		sb.append(a);
		sb.deleteCharAt(4);
		System.out.println(sb);
	}

}
