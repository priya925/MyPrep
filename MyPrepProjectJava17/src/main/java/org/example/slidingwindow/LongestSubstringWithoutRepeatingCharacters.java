package org.example.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){
        String s = "aaabcdefghijklmnopqrssssstabcdefghijklmnopqrstuvwxyz";
        System.out.println(largestSubStringWithoutRepeatingCharacters(s));
    }

    public static String largestSubStringWithoutRepeatingCharacters(String str) {
        int start = 0, end = 0, maxStart = 0, maxEnd = 0, maxSize = 0;
        char[] charArray = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        charMap.put(charArray[start], 1);
        while (end < charArray.length) {
            end++;

            if (end < charArray.length){
                if(charMap.get(charArray[end]) == null) {
                    charMap.put(charArray[end], 1);
                } else {
                    charMap.put(charArray[end], charMap.get(charArray[end])+1);
                }
            }

            if(charMap.size() == end-start+1){
                maxSize = maxSize<(end-start+1)? end-start+1 : maxSize;
                maxStart = start;
                maxEnd = end;
            }else {
                charMap.put(charArray[start], charMap.get(charArray[start])-1);
                if(charMap.get(charArray[start]) == 0)
                    charMap.remove(charArray[start]);
                start++;
            }
        }
        return str.substring(maxStart, maxEnd + 1);

    }
}
