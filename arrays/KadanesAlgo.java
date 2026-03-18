public class KadanesAlgo{
    //function to find maximum subarray
    public int maxSubArray(int[]nums){
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
       int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };  
       KadanesAlgo k1= new KadanesAlgo();
       System.out.println(k1.maxSubArray(arr));
    }
}