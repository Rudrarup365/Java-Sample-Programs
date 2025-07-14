package testing;

import java.util.Arrays;

public class SmallestUnrepresentableSum {

	public static int findSmallestUnrepresentable(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        int res = 1;

        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than res, we can't make res
            if (arr[i] > res) {
                break;
            }
            res += arr[i]; // Otherwise, include it in our sum
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int result = findSmallestUnrepresentable(arr);
        System.out.println("Smallest number that cannot be formed: " + result);
    }

}
