package StaticArrays.Tier1;

import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] res = reverseArray(N, arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    private static int[] reverseArray(int N, int[] arr) {
        for(int i = 0; i < N/2; i++){
            int temp = arr[i];
            arr[i] = arr[N-i-1];
            arr[N-i-1] = temp;
        }

        return arr;
    }
}
