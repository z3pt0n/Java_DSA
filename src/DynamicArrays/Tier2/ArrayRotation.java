package DynamicArrays.Tier2;

//Rotate Array by K Steps
//
//✅ Problem: Rotate array to right by K steps.
//
//📚 Topics: Reversal, modulo
//
//🔍 Example:
//
//Input: arr = [1,2,3,4,5,6,7], k = 3
//
//Output: [5,6,7,1,2,3,4]
//
//✅ Use: ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in ArrayList: ");
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Enter the value to be rotated: ");
        int val = scanner.nextInt();

        arrayRotation1(list, N, val);
    }

    private static void arrayRotation1(List<Integer> list, int N, int val) {
        val = val % N; // Handle overflow
        List<Integer> rotated = new ArrayList<>();

        // Add elements from val to end
        for (int i = val; i < N; i++) {
            rotated.add(list.get(i));
        }

        // Add elements from 0 to val-1
        for (int i = 0; i < val; i++) {
            rotated.add(list.get(i));
        }

        System.out.println("Rotated Array is: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }


}
