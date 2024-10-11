package testing;

public class StringWordCount {

	public static void main(String[] args) {
		String str="Rats live on no evil star";
		for (String s : str.split(" ")) {
			System.out.println(s + " " + s.length());
		}
	}

}
