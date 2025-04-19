package StaticArrays.Tier2;

//Array Rotation
//
//Description: Rotate an array by k positions. Elements that go beyond the end of the array should wrap around.
//
//Concepts: Array manipulation, modular arithmetic.
//
//Example:
//Input: [1, 2, 3, 4, 5], Rotate by 2
//Output: [4, 5, 1, 2, 3]


import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to be rotated by: ");
        int R = scanner.nextInt();

        int[] res = arrayRotation(N, arr, R);
        System.out.println("Rotated Array is: ");
        for(int num : res){
            System.out.print(num +" ");
        }
    }

    private static int[] arrayRotation(int N, int[] arr, int R) {
    int[] res = new int[N];

    while(R > N) R = R-N;

    for(int i = 0; i < N; i++){
        if(i+R >= N) res[i+R-N] = arr[i];
        else {
            res[i+R] = arr[i];
        }
    }
    return res;
    }
}
