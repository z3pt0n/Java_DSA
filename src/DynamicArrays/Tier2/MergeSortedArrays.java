package DynamicArrays.Tier2;

//Merge Two Sorted Arrays
//
//✅ Problem: Merge and sort two sorted arrays.
//
//📚 Topics: Two-pointer
//
//🔍 Example:
//
//Input: [1, 3, 5], [2, 4, 6]
//
//Output: [1, 2, 3, 4, 5, 6]
//
//✅ Use: ArrayList

import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter the number of elements in first sorted array: ");
        int N1 = sc.nextInt();
        int[] arr1 = new int[N1];
        System.out.println("Enter elements of the first sorted array:");
        for (int i = 0; i < N1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter the number of elements in second sorted array: ");
        int N2 = sc.nextInt();
        int[] arr2 = new int[N2];
        System.out.println("Enter elements of the second sorted array:");
        for (int i = 0; i < N2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge the arrays
        ArrayList<Integer> mergedList = mergeSortedArrays(arr1, arr2);

        // Output the merged sorted ArrayList
        System.out.println("Merged Sorted ArrayList:");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        // Merge both arrays while there are elements in both
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else {
                result.add(arr2[j]);
                j++;
            }
        }

        // Add remaining elements from arr1 (if any)
        while (i < arr1.length) {
            result.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2 (if any)
        while (j < arr2.length) {
            result.add(arr2[j]);
            j++;
        }

        return result;
    }

}
