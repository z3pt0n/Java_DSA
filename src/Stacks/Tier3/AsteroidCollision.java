package Stacks.Tier3;

//Asteroid Collision
//
//✅ Problem: Simulate collision of asteroids moving in directions.
//
//📘 Topics: Stack
//
//🔍 Example:
//
//Input: [5,10,-5]
//
//Output: [5,10]
//
//✅ Use: Stack
import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] asteroids = new int[n];
        for (int i = 0; i < n; i++) {
            asteroids[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.peek() < -a) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -a) {
                        stack.pop();
                        a = 0;
                        break;
                    } else {
                        a = 0;
                        break;
                    }
                }
                if (a != 0) {
                    stack.push(a);
                }
            }
        }

        System.out.println("Surviving Asteroids: " + stack);
    }
}

