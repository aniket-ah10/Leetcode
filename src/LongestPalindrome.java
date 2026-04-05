/*Question Number: 5
Level: Medium
Topic Covered:Two Pointers,String,Dynamic Programming
Date: 5th April 2026
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String sub="";
        int len=s.length();
        int maxLen=0;
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=i+maxLen;j--){
                int start=i;
                int end=j;
                while(start<end){
                    if(s.charAt(start)!=s.charAt(end))
                        break;
                    start++;
                    end--;
                }
                if(start>=end){
                    maxLen=j-i;
                    sub=s.substring(i,j+1);
                }
            }
        }
        return sub;
    }
}
