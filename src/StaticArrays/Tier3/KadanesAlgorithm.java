package StaticArrays.Tier3;

//Find the Subarray with the Maximum Sum (Kadane’s Algorithm)
//
//Description: Given an array of integers, find the contiguous subarray that has the largest sum.
//
//Concepts: Dynamic programming, Kadane’s algorithm.
//
//Example:
//Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Output: 6 (Subarray: [4, -1, 2, 1])

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        findMaxSubarray(arr);
    }

    private static void findMaxSubarray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
