package testing;

public class GreaterAndSmallerOfTwoWithoutComparison {

	public static void main(String[] args) {
		int a = 20;
		int b = -30;
		System.out.println("Greater of " + a + " and " + b + " is " + greater (a,b));
		System.out.println("Smaller of " + a + " and " + b + " is " + smaller (a,b));
	}
	static int greater(int a, int b) {
		return ((Math.abs(a-b)+(a+b))/2);
	}
	static int smaller(int a, int b) {
		return (int) ((a+b-(a-b))/2);
	}

}
