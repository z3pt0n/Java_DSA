package StaticArrays.Tier2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//Remove Duplicates from an Array
//
//Description: Given an array, remove duplicates and return the array with only unique elements.
//
//Concepts: Array manipulation, set operations.
//
//Example:
//Input: [1, 2, 2, 3, 4, 4]
//Output: [1, 2, 3, 4]

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Set<Integer> res = removeDuplicates(N, arr);
        System.out.print("Array after removing duplicates is: ");
        for(int num  :res){
            System.out.print(num+" ");
        }

    }

    public static Set removeDuplicates(int N, int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int num  : arr){
            set.add(num);
        }
        return set;
    }
}
