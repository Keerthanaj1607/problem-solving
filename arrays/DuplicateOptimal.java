import java.util.*;
class Solution{
    static int findDuplicate(int[]nums){
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow= nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        fast=nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

  // return the duplicate value
        return slow;
    }
}
public class DuplicateOptimal {
    public static void main(String[] args) {
         int[] arr = new int[]{1, 3, 4, 2, 3};

        // compute and print result
        System.out.println("The duplicate element is " + Solution.findDuplicate(arr));
    
    }
    
}
