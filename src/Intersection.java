/*Question Number: 2095
Level: Easy
Topic Covered:HashMap,Queue
Date: 7th April 2026
 */
import java.util.HashSet;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        for(int i:nums1){
            n1.add(i);
        }
        for(int i:nums2){
            if(n1.contains(i)){
                n2.add(i);
            }
        }
        int[] ans=new int[n2.size()];
        int index=0;

        for(int i:n2){
            ans[index++]=i;
        }
        return ans;
    }
}
