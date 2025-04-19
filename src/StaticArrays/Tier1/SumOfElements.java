package StaticArrays.Tier1;

import java.util.*;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = SumOfElements(N, arr);
        System.out.println(res);
    }

    private static int SumOfElements(int N, int[] arr) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
