package JavaPackage;

public class LuckyNumber {

	public static void main(String[] args) {
		int number=121213;
		System.out.println(isLucky(number));
		System.out.println(isLucky(12345500));
	}
	public static Boolean isLucky(int number) {
		
		Boolean out=false;
		String num=Integer.toString(number);
		int[]numArr=new int[num.length()];
		for (int i=0;i<numArr.length;i++) {
			numArr[i]=num.charAt(i)-'0';
			//System.out.println(numArr[i]);
		}
		int sumleft=0;
		int sumright=0;
		for (int i=0;i<numArr.length/2;i++) {
			sumleft=sumleft+numArr[i];
			sumright=sumright+numArr[numArr.length-i-1];
		}
		return (sumleft==sumright);
	}

}
