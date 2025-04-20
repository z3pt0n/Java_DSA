package Stacks.Tier2;

//Daily Temperatures
//
//✅ Problem: For each day, how many days to wait for a warmer one?
//
//📘 Topics: Monotonic Stack
//
//🔍 Example:
//
//Input: [73,74,75,71,69,72,76,73]
//
//Output: [1,1,4,2,1,1,0,0]
//
//✅ Use: Stack

import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of temperatures:");
        int n = sc.nextInt();
        int[] temp = new int[n];

        System.out.println("Enter the temperatures:");
        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        int[] result = dailyTemperatures(temp);
        System.out.println("Output:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack of indices

        for (int i = 0; i < n; i++) {
            // While current temperature is greater than the temp at index on top of the stack
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }
}
