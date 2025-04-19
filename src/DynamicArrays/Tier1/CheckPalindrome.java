package DynamicArrays.Tier1;

//Check if Array is Palindrome
//
//✅ Problem: Is the array same forward and backward?
//
//📚 Topics: Two-pointer
//
//🔍 Example:
//
//Input: [1, 2, 3, 2, 1]
//
//Output: true
//
//✅ Use: ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in ArrayList: ");
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        palindrome(list, N);
    }

    private static void palindrome(List<Integer> list, int N) {
        int i = 0, j = N-1;
        while(i < N/2){
            if(!list.get(i).equals(list.get(j))){
                System.out.println("Not Palindrome");
                return;
            } else {
                i++;
                j--;
            }

        }
        System.out.println("Palindrome");
    }

}
