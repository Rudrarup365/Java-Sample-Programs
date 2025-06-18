package testing;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is interview question";
		Reverse(str);
	}
	public static void Reverse(String str) {
		String[] words=str.split(" ");
		String rev="";
		for (int i=0;i<words.length; i++) {
			for (int j=words[i].length()-1;j>=0;j--) {
				rev +=words[i].charAt(j);
			}
			rev += " ";
		}
		System.out.println(rev);
	}
}
