package JavaPackage;

public class ReverseString {

	public static void main(String[] args) {
		String s="My name is Khan";
		String[] out1=s.split(" ");
		//s.spl
		String out="";
		for(int i=out1.length-1;i>=0;i--) {
			out=out + " " + out1[i];
		}
		System.out.println(out);
		
	}


}
