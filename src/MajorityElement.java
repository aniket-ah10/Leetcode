/*Question Number: 169
Level: Easy
Topic Covered:Hash Table,Sorting,Divide and Conquer,Counting
Date: 6th April 2026
 */
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int max=0;
        int maxKey=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n:nums){
            if(freq.containsKey(n)){
                freq.put(n,freq.get(n)+1);
            }
            else
                freq.put(n,1);
        }
        for(int key:freq.keySet()){
            if(freq.get(key)>max){
                max=freq.get(key);
                maxKey=key;
            }
        }
        return maxKey;
    }
}
