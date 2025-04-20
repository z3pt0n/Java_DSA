package Stacks.Tier1;

//Valid Parentheses
//
//✅ Problem: Check if brackets are balanced.
//
//🔢 Input: Only '(', ')', '{', '}', '[', ']'
//
//📘 Topics: Stack Matching
//
//🔍 Example:
//
//Input: "({[]})"
//
//Output: true
//
//✅ Use: Stack


import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        validParentheses(str);
    }

    private static void validParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Invalid Parentheses");
                    return;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    System.out.println("Invalid Parentheses");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}
