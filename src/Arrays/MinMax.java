package Arrays;

import java.util.Scanner;

class MinMax {
    public static void findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            arr = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }

        findMinMax(arr);
    }
}
