/*Question Number: 3191
Level: Medium
Topic Covered:Array,Bit Manipulation,Sliding Window
Date: 3rd April 2026
 */
public class MinOperations {
    public int minOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==1){
                continue;
            }
            else{
                if(nums[i]==0)
                    nums[i]=1;
                else nums[i]=0;
                if(nums[i+1]==0)
                    nums[i+1]=1;
                else
                    nums[i+1]=0;
                if(nums[i+2]==0)
                    nums[i+2]=1;
                else nums[i+2]=0;
                op++;
            }
            //Instead of change each bit manually  we can use bit manipulation of xor x^1=1 if(x=0) or if(x=1) then it is x^1=0
        }
        if(nums[nums.length-1]==0||nums[nums.length-2]==0)
            return -1;
        else
            return op;
    }
}
