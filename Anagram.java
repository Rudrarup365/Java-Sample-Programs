package testing;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("cork","rock"));
		System.out.println(isAnagram("cat","mat"));
	

	}
	public static boolean isAnagram(String a, String b){
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
		return anagram;
	}

}
