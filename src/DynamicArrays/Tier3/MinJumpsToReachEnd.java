package DynamicArrays.Tier3;

//Min Jumps to Reach End
//
//✅ Problem: Each arr[i] = max jump from i. Min jumps to end?
//
//📚 Topics: Greedy / DP
//
//🔍 Example:
//
//Input: [2,3,1,1,4]
//
//Output: 2 (0→1→4)
//
//✅ Use: ArrayList

import java.util.*;

public class MinJumpsToReachEnd {

    public static int minJumps(int[] arr) {
        int n = arr.length;

        // If the array has only one element, no jumps are needed.
        if (n <= 1) return 0;

        // If the first element is 0, we can't move anywhere.
        if (arr[0] == 0) return -1;

        int jumps = 1; // We need at least one jump to start.
        int farthest = arr[0]; // The farthest we can reach from the current position.
        int currentEnd = arr[0]; // End of the current jump.

        for (int i = 1; i < n; i++) {
            // Update the farthest we can reach from index i
            farthest = Math.max(farthest, i + arr[i]);

            // If we have reached the end of the current jump range
            if (i == currentEnd) {
                // Increment the jump count
                jumps++;

                // Update the currentEnd to the farthest we can reach
                currentEnd = farthest;

                // If the currentEnd reaches or exceeds the last index, we are done
                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }
        }

        // If we reach here, it means we can't reach the end
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take custom input for the array size
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        // Take custom input for the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method to find the minimum number of jumps
        int result = minJumps(arr);

        // Output the result
        System.out.println("Minimum Jumps to Reach End: " + result);
    }
}

