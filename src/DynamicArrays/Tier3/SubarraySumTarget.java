package DynamicArrays.Tier3;

//Count Subarrays With Given Sum
//
//✅ Problem: Count subarrays that sum to target.
//
//📚 Topics: Prefix sum + HashMap
//
//🔍 Example:
//
//Input: arr = [1,1,1], target = 2
//
//Output: 2
//
//✅ Use: ArrayList, HashMap

import java.util.*;

public class SubarraySumTarget {

    // Method to count subarrays with the given sum
    public static int countSubarraysWithSum(int[] arr, int target) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // For subarrays starting from index 0

        int sum = 0, count = 0;

        for (int num : arr) {
            sum += num;

            if (prefixSumCount.containsKey(sum - target)) {
                count += prefixSumCount.get(sum - target);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int result = countSubarraysWithSum(arr, target);
        System.out.println("Number of subarrays with given sum: " + result);
    }
}

