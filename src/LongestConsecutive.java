/*Question Number:128
Level: Medium
Topic Covered:HashMap
Date: 8th April 2026
 */
import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=0;
                while(set.contains(num)){
                    count++;
                    num++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
