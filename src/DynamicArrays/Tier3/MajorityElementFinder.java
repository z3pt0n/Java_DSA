package DynamicArrays.Tier3;

//Majority Element (>n/2 times)
//
//✅ Problem: Return element appearing >n/2 times.
//
//📚 Topics: Boyer-Moore Voting Algorithm
//
//🔍 Example:
//
//Input: [3,3,4,2,3,3,3]
//
//Output: 3
//
//✅ Use: ArrayList

import java.util.*;

public class MajorityElementFinder {

    public static int findMajorityElement(List<Integer> list) {
        int count = 0, candidate = -1;

        // Step 1: Find Candidate
        for (int num : list) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify Candidate
        count = 0;
        for (int num : list) {
            if (num == candidate) count++;
        }

        return count > list.size() / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int result = findMajorityElement(list);
        if (result != -1)
            System.out.println("Majority Element: " + result);
        else
            System.out.println("No Majority Element found.");
    }
}
