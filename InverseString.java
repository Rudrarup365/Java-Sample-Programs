package testing;

public class InverseString {

	public static void main(String[] args) {
		String str="Rats live on no evil star";
		String break1[]=str.split(" ");
		for (int i=break1.length-1;i>=0;i--) {
			System.out.println(break1[i]);
		}
	}

}
