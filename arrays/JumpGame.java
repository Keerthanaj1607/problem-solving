public class JumpGame {

    // Function to determine if u can reach last index
    public boolean canJump(int[]nums){
    int maxIndex=0;
    for(int i=0;i<nums.length;i++){
        if(i>maxIndex){
            return false;
        }
        maxIndex=Math.max(maxIndex, i+nums[i]);
    }
      // If loop completes, we can reach the last index
        return true;
    }
     public static void main(String[] args) {
        int[] nums = {4, 3, 7, 1, 2};

        System.out.print("Array representing maximum jump from each index: ");
        for (int val : nums) System.out.print(val + " ");
        System.out.println();

        JumpGame game = new JumpGame();
        boolean ans = game.canJump(nums);

        if (ans)
            System.out.println("It is possible to reach the last index.");
        else
            System.out.println("It is not possible to reach the last index.");
    }
    
}
