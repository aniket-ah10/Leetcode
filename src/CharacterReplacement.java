/*Question Number: 424
Level: Medium
Topic Covered:Sliding Window,HashMap
Date: 14th April 2026
 */

import java.util.HashMap;

public class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> charFreq = new HashMap<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
            int hashSize = 0;
            int highest = 0;
            for (char x : charFreq.keySet()) {
                highest = Math.max(highest, charFreq.get(x));
                hashSize += charFreq.get(x);
            }
            if (hashSize - highest <= k) {
                maxLen = hashSize;
            } else {
                if (charFreq.get(s.charAt(left)) == 1) {
                    charFreq.remove(s.charAt(left));
                } else {
                    charFreq.put(s.charAt(left), (charFreq.get(s.charAt(left)) - 1));
                }
                left++;
            }
            right++;
        }
        return maxLen;
    }
}
