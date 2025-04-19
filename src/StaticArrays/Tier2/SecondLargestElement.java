package StaticArrays.Tier2;

//Find the Second Largest Element in an Array
//
//Description: Given an array, find the second largest element.
//
//Concepts: Array traversal, comparisons.
//
//Example:
//Input: [1, 3, 4, 5, 2]
//Output: 4

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = secondLargestNum(N, arr);
        System.out.println("Second Largest is: " + res);
    }

    private static int secondLargestNum(int N, int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
