package StaticArrays.Tier2;

//Find the Missing Number in an Array (1 to N)
//
//        Description: Given an array containing integers from 1 to N, with one number missing, find the missing number.
//
//        Concepts: Sum formula, array traversal.
//
//        Example:
//        Input: [1, 2, 4, 5], N = 5
//        Output: 3


import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = missingNumber(N, arr);
        System.out.println("Missing Number is: " + res);
    }

    private static int missingNumber(int N, int[] arr) {
        int sum = 0;
        int sumOfNumbers = N*(N+1)/2;

        for(int num : arr){
            sum += num;
        }
        return sumOfNumbers - sum;
    }
}
