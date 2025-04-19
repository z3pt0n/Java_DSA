package StaticArrays.Tier3;

//Find the Majority Element (If any) in an Array
//
//Description: Given an array of integers, find the majority element (the element that appears more than n/2 times). If no such element exists, return -1.
//
//Concepts: Boyer-Moore voting algorithm, array traversal.
//
//Example:
//Input: [1, 2, 3, 2, 2]
//Output: 2


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = majorityElement(N, arr);
        System.out.println(res);
    }

    private static int majorityElement(int N, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() > N / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

//Boyer-Moore Version
//private static int majorityElement(int N, int[] arr) {
//    int candidate = -1;
//    int count = 0;
//
//    // First pass: Find candidate
//    for (int num : arr) {
//        if (count == 0) {
//            candidate = num;
//            count = 1;
//        } else if (num == candidate) {
//            count++;
//        } else {
//            count--;
//        }
//    }
//
//    // Second pass: Verify candidate
//    count = 0;
//    for (int num : arr) {
//        if (num == candidate) {
//            count++;
//        }
//    }
//
//    return (count > N / 2) ? candidate : -1;
//}