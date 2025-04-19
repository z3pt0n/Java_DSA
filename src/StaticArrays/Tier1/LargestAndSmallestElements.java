package StaticArrays.Tier1;

import java.util.Scanner;

public class LargestAndSmallestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] res = minAndMax(N, arr);
        for(int num : res){
            System.out.print(num+" ");
        }

    }

    private static int[] minAndMax(int N, int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int[] res = new int[2];
        for(int i = 0; i < N; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        res[0] = max;
        res[1] = min;
        return res;
    }
}
