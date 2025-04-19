package DynamicArrays.Tier1;

//Reverse a Dynamic Array
//
//✅ Problem: Reverse array in-place.
//
//📚 Topics: Swapping
//
//🔍 Example:
//
//Input: [10, 20, 30]
//
//Output: [30, 20, 10]
//
//✅ Use: ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in ArrayList: ");
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        arrayReversal(list, N);
    }

    private static void arrayReversal(List<Integer> list, int N) {

        int j = N-1;
        for (int i = 0; i < N/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            j--;
        }
        System.out.println("Reversed Array is: ");
        for(int num : list){
            System.out.print(num+" ");
        }
    }
}
