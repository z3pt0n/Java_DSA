package StaticArrays.Tier3;

//Find All Pairs with a Given Sum in an Array
//
//Description: Given an array and a sum, find all pairs of elements in the array whose sum equals the given sum.
//
//        Concepts: Hashing, array traversal.
//
//Example:
//Input: [1, 2, 3, 4, 3, 5], Sum = 6
//Output: (1, 5), (2, 4), (3, 3)

import java.util.HashSet;
import java.util.Scanner;

public class FindPairsOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter value of sum: ");
        int sum = scanner.nextInt();

        findPairs(arr, sum);
    }

    // Method to find pairs with the given sum
    public static void findPairs(int[] arr, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            // Check if the complement (targetSum - num) exists in the set
            if (seen.contains(targetSum - num)) {
                System.out.println("Pair found: (" + num + ", " + (targetSum - num) + ")");
            }
            // Add the current number to the set
            seen.add(num);
        }
    }
}
