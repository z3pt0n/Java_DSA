package DynamicArrays.Tier2;

//Longest Increasing Subsequence
//
//✅ Problem: Return length of LIS.
//
//📚 Topics: DP + Binary Search
//
//🔍 Example:
//
//Input: [10, 9, 2, 5, 3, 7, 101, 18]
//
//Output: 4 (LIS = [2, 3, 7, 101])
//
//✅ Use: ArrayList, Binary Search

import java.util.*;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        List<Integer> lis = new ArrayList<>();

        for (int num : nums) {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) {
                pos = -(pos + 1); // Insertion point
            }

            if (pos == lis.size()) {
                lis.add(num);
            } else {
                lis.set(pos, num);
            }
        }

        return lis.size(); // Length of LIS
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int N = sc.nextInt();
        int[] nums = new int[N];

        System.out.println("Enter array elements:");
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int result = lengthOfLIS(nums);
        System.out.println("Length of LIS: " + result);
    }
}

