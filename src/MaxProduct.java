/*Question Number: 1464
Level: Easy
Topic Covered:Array Sorting
Date: 2nd April 2026
 */
public class MaxProduct {
        public int maxProduct(int[] nums) {
            int secondMax=0;
            int firstMax=0;

            for(int i=0;i<nums.length;i++){
                if(nums[i]>firstMax){
                    int temp=firstMax;
                    firstMax=nums[i];
                    secondMax=temp;
                }
                else if(nums[i]>secondMax){
                    secondMax=nums[i];
                }
            }
            return (firstMax-1)*(secondMax-1);
        }
}
