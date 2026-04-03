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
        }
        if(nums[nums.length-1]==0||nums[nums.length-2]==0)
            return -1;
        else
            return op;
    }
}
