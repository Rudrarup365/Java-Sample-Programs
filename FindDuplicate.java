package testing;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"s","d","r","t","e","y"};
		findDuplicate(arr);
	}
	private static void findDuplicate(String arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i] + " is duplicate");
					return;
				}
			}
		}
		System.out.println("no duplicates");
	}

}
