package Stacks.Tier2;

//Min Stack
//
//✅ Problem: Implement a stack that returns min in O(1).
//
//📘 Topics: Stack of Pairs or Two Stacks
//
//🔍 Example:
//
//Push(2), Push(0), Push(3), Push(0), getMin → 0
//
//✅ Use: Stack

import java.util.*;

public class MinStack {
    static class minStack {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int x) {
            mainStack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            if (!mainStack.isEmpty()) {
                int removed = mainStack.pop();
                if (removed == minStack.peek()) {
                    minStack.pop();
                }
            }
        }

        public int top() {
            return mainStack.isEmpty() ? -1 : mainStack.peek();
        }

        public int getMin() {
            return minStack.isEmpty() ? -1 : minStack.peek();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        minStack stack = new minStack();

        System.out.println("Min Stack Operations:");
        System.out.println("Commands: push <num>, pop, top, min, exit");

        while (true) {
            String input = sc.nextLine().trim();
            if (input.equals("exit")) break;

            String[] parts = input.split(" ");

            switch (parts[0]) {
                case "push":
                    int val = Integer.parseInt(parts[1]);
                    stack.push(val);
                    System.out.println("Pushed: " + val);
                    break;

                case "pop":
                    stack.pop();
                    System.out.println("Popped top");
                    break;

                case "top":
                    System.out.println("Top: " + stack.top());
                    break;

                case "min":
                    System.out.println("Min: " + stack.getMin());
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        }

        sc.close();
    }
}

