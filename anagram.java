package testing;

public class anagram {

	public static void main(String[] args) {
		String a ="cork";
		String b ="rock";
		boolean anagram=true;
		int[] counter=new int[26];
		for (int i=0;i<counter.length;i++) {
			counter[i]=0;
		}
		for (int i=0;i<a.length();i++) {
			counter[a.charAt(i)-'a']++;
		}
		for (int i=0;i<b.length();i++) {
			counter[b.charAt(i)-'a']--;
		}
		for (int i=0;i<counter.length;i++) {
			if (counter[i]>0) {
				anagram=false;
			}
		}
		if (anagram) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}

	}

}
