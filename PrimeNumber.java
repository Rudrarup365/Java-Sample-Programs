package javapackage;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(47));
		System.out.println(isPrime(30));
	}
	public static boolean isPrime(int in) {
		if (in==0 || in==1) {
			return(false);
		}
		if (in==2) {
			return(true);
		}
		for(int i=2; i<=in/2;i++) {
			if (in%i==0) {
				return (false);
			}
		}
		return (true);
	}
}
