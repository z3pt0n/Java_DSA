package DynamicArrays.Tier3;

//Sliding Window Maximum
//
//✅ Problem: Return max of each window of size k.
//
//📚 Topics: Deque
//
//🔍 Example:
//
//Input: arr = [1,3,-1,-3,5,3,6,7], k = 3
//
//Output: [3,3,5,5,6,7]
//
//✅ Use: ArrayList, Deque

import java.util.*;

public class SlidingWindowMaximum {

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements not within the window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements smaller than the current element (because they can't be part of the maximum)
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add the current element index
            deque.offerLast(i);

            // If we have processed at least k elements, the front of the deque will be the maximum for the window
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        return result;
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

        // Take custom input for the window size
        System.out.print("Enter the window size (k): ");
        int k = sc.nextInt();

        // Call the method to find the maximum of each sliding window
        List<Integer> result = maxSlidingWindow(arr, k);

        // Output the result
        System.out.println("Max of each window: " + result);
    }
}
