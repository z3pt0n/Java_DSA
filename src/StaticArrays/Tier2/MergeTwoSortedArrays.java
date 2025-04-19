package StaticArrays.Tier2;

//Merge Two Sorted Arrays into One Sorted Array
//
//Description: Given two sorted arrays, merge them into a single sorted array.
//
//Concepts: Array manipulation, merge algorithm.
//
//Example:
//Input: [1, 3, 5] and [2, 4, 6]
//Output: [1, 2, 3, 4, 5, 6]


import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of first array: ");
        int N = scanner.nextInt();

        System.out.println("Enter first array elements: ");
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of second array: ");
        int M = scanner.nextInt();

        System.out.println("Enter second array elements: ");
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = scanner.nextInt();
        }

        Set<Integer> res = mergeArrays(N, arr1, M, arr2);

        for(int num  : res){
            System.out.print(num+" ");
        }
    }

    private static Set mergeArrays(int N, int[] arr1, int M, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num: arr2){
            set.add(num);
        }
        return set;
    }
}
