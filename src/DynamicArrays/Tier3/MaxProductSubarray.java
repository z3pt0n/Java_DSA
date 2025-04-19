package DynamicArrays.Tier3;

//Maximum Product Subarray
//
//✅ Problem: Return max product of contiguous subarray.
//
//📚 Topics: Track max & min
//
//🔍 Example:
//
//Input: [2,3,-2,4]
//
//Output: 6 (2*3)
//
//✅ Use: ArrayList

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int max_prod = nums[0];  // Max product so far
        int min_prod = nums[0];  // Min product so far (important for negative numbers)
        int result = max_prod;   // Store the result for the maximum product

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If current element is negative, swap max_prod and min_prod
            if (current < 0) {
                int temp = max_prod;
                max_prod = min_prod;
                min_prod = temp;
            }

            // Calculate the max and min products ending at the current index
            max_prod = Math.max(current, max_prod * current);
            min_prod = Math.min(current, min_prod * current);

            // Update result
            result = Math.max(result, max_prod);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product of subarray is: " + maxProduct(nums));  // Output: 6
    }
}
