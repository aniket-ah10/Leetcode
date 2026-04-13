/*Question Number: 11
Level: Medium
Topic Covered:Two pointer,Greedy
Date: 13th April 2026
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int maxWater=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            boolean isStartBig=false;
            int tankHeight=0;
            if(height[start]>height[end]){
                isStartBig=true;
                tankHeight=height[end];
            }
            else{
                tankHeight=height[start];
            }
            int capacity=(end-start)*tankHeight;
            maxWater=Math.max(capacity,maxWater);
            if(isStartBig)
                end--;
            else
                start++;
        }
        return maxWater;
    }
}
