class Solution{
    // Main jump function
    public int jump(int[] nums) {
        return minJumps(nums, 0);
    }

    // Helper method to recursively calculate the minimum number of jumps
    private int minJumps(int[] nums, int position) {
        // If current position is at or beyond the last index
        if (position >= nums.length - 1) return 0;

        // If stuck at a 0
        if (nums[position] == 0) return Integer.MAX_VALUE;

        int minStep = Integer.MAX_VALUE;

        // Try every jump from 1 to nums[position]
        for (int jump = 1; jump <= nums[position]; jump++) {
            int subResult = minJumps(nums, position + jump);
            if (subResult != Integer.MAX_VALUE) {
                minStep = Math.min(minStep, 1 + subResult);
            }
        }

        return minStep;
    }
}

// Driver class with main method
public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        Solution sol = new Solution();
        System.out.println("Minimum number of jumps: " + sol.jump(nums));
    }
}