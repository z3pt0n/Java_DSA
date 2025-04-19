package StaticArrays.Tier1;

import java.util.Scanner;

public class OccurenceOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched");
        int a = scanner.nextInt();

        int res = OccurenceOfElement(N, arr, a);
        System.out.println("Element "+ a + " occurs " + res +" times ");
    }

    public static int OccurenceOfElement(int N, int[] arr, int a){
        int count = 0;
        for(int num : arr){
            if(num == a) count++;
        }
        return count;
    }
}
