package StaticArrays.Tier3;

import java.util.Scanner;

/// Rearrange Array Alternating Positive and Negative Numbers
//
//Description: Given an array, rearrange the elements such that positive and negative numbers are placed alternately. If a number cannot be placed, leave it in its original position.
//
//Concepts: Array manipulation, two-pointer technique.
//
//Example:
//Input: [1, -2, 3, -4, 5, -6]
//Output: [1, -2, 3, -4, 5, -6] (may vary depending on the implementation)

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        rearrange(arr, N);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void rearrange(int[] arr, int N) {
        int i = -1;

        // Step 1: Partition negatives and positives
        for (int j = 0; j < N; j++) {
            if (arr[j] < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        int neg = 0, pos = i + 1;

        // Step 2: Interleave negative and positive elements
        while (neg < pos && pos < N && arr[neg] < 0) {
            swap(arr, neg, pos);
            pos++;
            neg += 2;
        }
    }

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
