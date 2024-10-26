package testing;

public class CheckVowel {

	public static void main(String[] args) {

		checkV("sdfrty");
		checkV("hello world");

	}
	public static void checkV(String input) {
		String[] vowel= {"a","e","i","o","u"};
		Boolean present=false;
		for(int i=0;i<vowel.length;i++) {
			if(input.contains(vowel[i])) {
				present=true;
				break;
			}
		}
		if (present) {
			System.out.println("String contains vowels");
		}
		else {
			System.out.println("String does not contains vowels");
		}
	}

}
