package Arrays;

public class MaxSubArray {
}
class Solution {

    public static int maxSubArray(int[] arr) {

        int maxSum = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.max(arr[i], current + arr[i]);

            maxSum = Math.max(maxSum, current);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(arr));
    }
}