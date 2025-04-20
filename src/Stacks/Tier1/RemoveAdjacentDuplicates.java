package Stacks.Tier1;

//Remove Adjacent Duplicates
//
//✅ Problem: Remove adjacent duplicates using stack.
//
//🔍 Example:
//
//Input: "abbaca"
//
//Output: "ca"
//
//✅ Use: Stack

import java.util.*;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // or sc.next()

        removeAdjacentDuplicates(str);
    }

    private static void removeAdjacentDuplicates(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for(char c : stack){
            System.out.print(c);
        }
    }
}
