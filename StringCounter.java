package JavaPackage;

import java.util.Arrays;

public class StringCounter {

	public static void main(String[] args) {
		String s1="aabddcc";
		String s2="adcaa";
		countPairs(s1, s2);
	}
	public static void countPairs(String s1, String s2) {
		int count=0;
		int[] s1counter=new int[26];
		int[] s2counter=new int[26];
		Arrays.fill(s1counter, 0);
		Arrays.fill(s2counter, 0);
		//Array.
		for (int i=0;i<s1.length();i++) {
			s1counter[(s1.charAt(i)-'a')]++;
		}
		for (int i=0;i<s2.length();i++) {
			s2counter[(s2.charAt(i)-'a')]++;
		}
		for(int i=0;i<26;i++) {
			if (s1counter[i]<s2counter[i]) {
				count+=s1counter[i];
			}
			else {
				count+=s2counter[i];
			}
		}
		System.out.println(count);
	}

}
