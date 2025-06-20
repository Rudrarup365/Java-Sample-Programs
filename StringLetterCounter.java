package testing;

import java.util.HashMap;

public class StringLetterCounter {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JAVA J2EE JAVA JSP J2EE";
		char chararr[] = str.toCharArray();
		System.out.println(chararr);
		HashMap<Character,Integer> charcount=new HashMap<Character,Integer>();
		for (int i=0; i<chararr.length;i++) {
			if (charcount.get(chararr[i])==null) {
				charcount.put(chararr[i], 1);
			}
			else {
				int counter=charcount.get(chararr[i]);
				charcount.put(chararr[i], counter+1);
			}
		}
		System.out.println(charcount);
	}

}
