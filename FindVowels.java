package javapackage;

public class FindVowels {

	public static void main(String[] args) {
		String searchstra="Why";
		String searchstrb="What";
		System.out.println(containsVowel(searchstra));
		System.out.println(containsVowel(searchstrb));
	}
	public static boolean containsVowel(String in) {
		return in.matches(".*[aeiouAEIOU].*");
	}

}
