package testing;

public class EvenOddCounter {

	static int[] countOddEven(int[] arr) {
		int oddCount=0,evenCount=0;
		for (int num:arr) {
			if ((num & 1) ==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		return(new int[] {oddCount,evenCount});
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] ans=countOddEven(arr);
		System.out.println(ans[0]+ " " + ans[1]);
	}

}
