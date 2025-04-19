package StaticArrays.Tier3;

//Find the Intersection of Two Arrays
//
//Description: Given two arrays, find the common elements between them.
//
//Concepts: Hashing, set operations.
//
//Example:
//Input: [1, 2, 3, 4, 5] and [3, 4, 5, 6, 7]
//Output: [3, 4, 5]

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfArrays {
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

        Set<Integer> res = intersectArrays(N, arr1, M, arr2);
        System.out.println("Common Elements are: ");

        for(int num : res){
            System.out.print(num +" ");
        }

    }

    private static Set<Integer> intersectArrays(int N, int[] arr1, int M, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }

        for(int num : arr2){
            set2.add(num);
        }

        for(int num : set1){
            if(set2.contains(num)) res.add(num);
        }
        return res;
    }

}

//Better Method
//private static Set<Integer> intersectArrays(int N, int[] arr1, int M, int[] arr2) {
//    Set<Integer> set = new HashSet<>();
//    for (int num : arr2) set.add(num);
//
//    Set<Integer> result = new HashSet<>();
//    for (int num : arr1) {
//        if (set.contains(num)) result.add(num);
//    }
//    return result;
//}