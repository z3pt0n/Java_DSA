package Stacks.Tier1;

//Evaluate Reverse Polish Notation
//
//✅ Problem: Evaluate postfix expression.
//
//📘 Topics: Stack, Integer Parsing
//
//🔍 Example:
//
//Input: ["2","1","+","3","*"]
//
//Output: 9
//
//✅ Use: Stack

import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // or sc.next()

        reversePolishNotation(str);
    }

    private static void reversePolishNotation(String str) {
        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '+'){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            } else if (c == '*') {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            } else if (c == '/') {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            } else if (c == '-') {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            } else{
                int num = Integer.parseInt(String.valueOf(c));
                stack.push(num);
            }
        }
        System.out.println(stack.peek());
    }
}
//Input: 2 3 1 * + 9 -
