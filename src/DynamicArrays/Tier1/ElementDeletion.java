package DynamicArrays.Tier1;

// Delete an Element from Specific Index
//
//✅ Problem: Remove element at a given index.
//
//🔢 Input range: 0 ≤ idx < arr.length
//
//📚 Topics: Shifting, resizing
//
//🔍 Example:
//
//Input: arr = [5, 6, 7, 8], idx = 1
//
//Output: [5, 7, 8]
//
//✅ Use: ArrayList


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in ArrayList: ");
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Enter the index of element to be removed: ");
        int idx = scanner.nextInt();
        elementDeletion(list, N, idx);
    }

    private static void elementDeletion(List<Integer> list, int N, int idx) {
        list.remove(idx);
        for(int num : list){
            System.out.print(num+" ");
        }
    }
}
