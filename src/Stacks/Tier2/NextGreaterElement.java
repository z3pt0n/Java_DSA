package Stacks.Tier2;

//Next Greater Element
//
//✅ Problem: For each element, find next greater element.
//
//📘 Topics: Monotonic Stack
//
//🔍 Example:
//
//Input: [4,5,2,10]
//
//Output: [5,10,10,-1]
//
//✅ Use: Stack

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = nextGreaterElement(nums, n);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static int[] nextGreaterElement(int[] nums, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            // If no greater element to the right
            res[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element to stack
            stack.push(nums[i]);
        }

        return res;
    }
}
