package Stacks.Tier1;

// Reverse a String Using Stack
//
//✅ Problem: Reverse string using stack operations.
//
//🔢 Input: 1 ≤ length ≤ 10⁴
//
//📘 Topics: Stack, StringBuilder
//
//🔍 Example:
//
//Input: "hello"
//
//Output: "olleh"
//
//✅ Use: Stack

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // or sc.next()

        reverseString(str);
    }

    private static void reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
