package DynamicArrays.Tier1;

//Insert an Element at a Specific Index
//
//✅ Problem: Insert an element at given index in dynamic array.
//
//🔢 Input range: 0 ≤ idx ≤ arr.length
//
//📚 Topics: Array shifting, resizing
//
//🔍 Example:
//
//Input: arr = [1, 2, 4], val = 3, idx = 2
//
//Output: [1, 2, 3, 4]
//
//✅ Use: ArrayList


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in ArrayList: ");
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Enter the index of element to be added: ");
        int idx = scanner.nextInt();
        System.out.println("Enter the value of element to be added: ");
        int val = scanner.nextInt();

        elementInsertion(list, N, idx, val);
    }

    private static void elementInsertion(List<Integer> list, int N, int idx, int val) {
        list.add(idx,val);
        System.out.println("Updated Array is: ");
        for(int num : list){
            System.out.print(num+" ");
        }
    }
}
