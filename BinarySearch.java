package testing;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch ob = new BinarySearch();
		int arr[]= {2,3,4,10,40};
		int target=10;
		int result=ob.binarySearch(arr, target);
		if (result==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at " + result);
		}
	}
	
	
	int binarySearch(int arr[], int target) {
		int low=0,high=arr.length-1;
		while (low<=high) {
			int mid=low+(high-low)/2;
			if (arr[mid]==target) {
				return mid;
			}
			if (arr[mid] < target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		
		return -1;
	}
}
