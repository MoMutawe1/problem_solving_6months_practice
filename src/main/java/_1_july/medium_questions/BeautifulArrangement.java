package _1_july.medium_questions;

// question description: https://leetcode.com/problems/beautiful-arrangement/
public class BeautifulArrangement {

    static int result = 0;

    public static void main(String[] args) {

        // time complexity: O(n)
        System.out.println(countArrangement(1));
    }

    public static int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = i + 1;
        permute(nums, 0);  // recursive method
        return result;
    }

    private static void permute(int[] nums, int index) {    // index: Start Permuting Index
        if (index == nums.length)
            result++;
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            if(nums[index] % (index + 1) == 0 || (index + 1) % nums[index] == 0)
                permute(nums, index + 1);
            swap(nums, i, index);  // backtrack for other possible cases
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
