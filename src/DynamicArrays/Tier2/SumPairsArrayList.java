package DynamicArrays.Tier2;

//Find All Pairs with a Given Sum
//
//✅ Problem: Find all pairs with arr[i] + arr[j] == target
//
//📚 Topics: HashMap
//
//🔍 Example:
//
//Input: arr = [1, 5, 7, -1], target = 6
//
//Output: [(1,5), (7,-1)]
//
//✅ Use: ArrayList, HashMap

import java.util.*;

public class SumPairsArrayList {
    public static void findPairs(List<Integer> list, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> printed = new HashSet<>(); // To avoid duplicates

        for (int num : list) {
            int complement = target - num;

            if (seen.contains(complement)) {
                // Sort to avoid duplicate like (5,1) and (1,5)
                int low = Math.min(num, complement);
                int high = Math.max(num, complement);
                String pair = low + "," + high;

                if (!printed.contains(pair)) {
                    System.out.println("(" + low + ", " + high + ")");
                    printed.add(pair);
                }
            }
            seen.add(num);
        }
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

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("Pairs with sum " + target + ":");
        findPairs(list, target);
    }
}

