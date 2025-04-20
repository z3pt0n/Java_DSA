package Stacks.Tier2;

//Decode String
//
//✅ Problem: Decode patterns like "3[a2[c]]"
//
//📘 Topics: Stack of Strings & Integers
//
//🔍 Example:
//
//Input: "3[a2[c]]"
//
//Output: "accaccacc"
//
//✅ Use: Stack

import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter encoded string:");
        String s = sc.nextLine();

        System.out.println("Decoded String: " + decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(curr);
                curr = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decoded = stringStack.pop();
                int count = countStack.pop();
                while (count-- > 0) {
                    decoded.append(curr);
                }
                curr = decoded;
            } else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
