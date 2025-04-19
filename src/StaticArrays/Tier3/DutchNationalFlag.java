package StaticArrays.Tier3;

//Sort an Array of 0s, 1s, and 2s (Dutch National Flag Problem)
//
//Description: Given an array of 0s, 1s, and 2s, sort the array without using extra space.
//
//Concepts: Three-way partitioning, in-place sorting.
//
//Example:
//Input: [1, 0, 2, 1, 0, 1, 2, 0]
//Output: [0, 0, 0, 1, 1, 1, 2, 2]


import java.util.Scanner;

public class DutchNationalFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] res = dutchNationalFlag(N, arr);
        for(int num : res){
            System.out.print(num);
        }
    }

    private static int[] dutchNationalFlag(int N, int[] arr) {
        int low = 0;
        int high = N-1;
        int i = 0;

        while(i <= high){
            if(arr[i] == 0){
                swap(arr, i, low);
                low++;
                i++;
            }else if(arr[i] == 2){
                swap(arr, i, high);
                high--;
            } else i++;
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
