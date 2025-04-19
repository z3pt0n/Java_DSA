package DynamicArrays.Tier1;

//Find Max and Min in Array
//
//✅ Problem: Find the max and min value.
//
//🔢 Range: 1 ≤ n ≤ 10⁵, -10⁹ ≤ val ≤ 10⁹
//
//📚 Topics: Traversal
//
//🔍 Example:
//
//Input: [4, -2, 9, 0]
//
//Output: Max = 9, Min = -2
//
//✅ Use: ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in ArrayList: ");
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        maxAndMin(list, N);
    }

    private static void maxAndMin(List<Integer> list, int N) {
        int max = list.getFirst();
        int min = list.getFirst();

        for (int num : list){
            if(num > max) max = num;
            if(num < min) min = num;
        }

        System.out.println("Max element is: " + max + "\nMin Element is: " + min);
    }
}
