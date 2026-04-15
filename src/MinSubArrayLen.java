/*Question Number:209
Level: Medium
Topic Covered:Sliding Window,Prefix Sum
Date: 15th April 2026
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=nums[0];
        int minLen=Integer.MAX_VALUE;
        while(right<nums.length){
            if(sum>=target){
                int len=right-left+1;
                minLen=Math.min(len,minLen);
                sum-=nums[left];
                left++;
            }
            else{
                right++;
                if(right==nums.length)
                    break;
                sum+=nums[right];
            }
        }
        if(minLen==Integer.MAX_VALUE)
            return 0;
        return minLen;
    }
}
