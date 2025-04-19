package DynamicArrays.Tier2;

//Move All Zeros to End
//
//✅ Problem: Move 0s to the end, keep order of others.
//
//📚 Topics: Two-pointer
//
//🔍 Example:
//
//Input: [0, 1, 0, 3, 12]
//
//Output: [1, 3, 12, 0, 0]
//
//✅ Use: ArrayList


import java.util.*;

public class MoveZeroesSwap {
    public static void moveZeroes(List<Integer> list) {
        int zeroPtr = 0;

        for (int nonZeroPtr = 0; nonZeroPtr < list.size(); nonZeroPtr++) {
            if (list.get(nonZeroPtr) != 0) {
                // Swap non-zero with the position of zero
                int temp = list.get(zeroPtr);
                list.set(zeroPtr, list.get(nonZeroPtr));
                list.set(nonZeroPtr, temp);
                zeroPtr++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        moveZeroes(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
