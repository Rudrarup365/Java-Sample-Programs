package testing;

public class APARTest {
	static int n1=1;
	static int n2=1;
	public static void main(String[] args) {
		fib(7);
	}
	public static void fib(int num){
		
		if (num==0) {
			return;
		}
		else {
			System.out.println(n1);
			int temp=n1+n2;
			n1=n2;
			n2=temp;
			fib(num-1);
		}
	}
}
