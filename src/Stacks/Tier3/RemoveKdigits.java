package Stacks.Tier3;

//Remove K Digits
//
//✅ Problem: Remove k digits to make smallest number.
//
//📘 Topics: Monotonic Stack
//
//🔍 Example:
//
//Input: num = "1432219", k = 3
//
//Output: "1219"
//
//✅ Use: Stack

import java.util.Scanner;
import java.util.Stack;

public class RemoveKdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        System.out.println(removeKdigits(num,k));
    }

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // Remove remaining k digits from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Construct the resulting string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse(); // Reverse to get the correct order

        // Remove leading zeros
        while (!sb.isEmpty() && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Handle edge case where result might be empty
        return !sb.isEmpty() ? sb.toString() : "0";
    }
}
