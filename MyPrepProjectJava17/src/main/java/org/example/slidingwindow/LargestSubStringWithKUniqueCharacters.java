package org.example.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringWithKUniqueCharacters {

    public static void main(String[] args){
        String str = "aabacdbebebe";
        int charCount = 4;
        System.out.println(largestSubStringForUniquesCharacters(str,charCount));

    }

    public static String largestSubStringForUniquesCharacters(String str, int k){
        int start = 0;
        int end = 0;
        int maxSize = 0;
        int maxSizeStart = 0, maxSizeEnd =0;
        char[] charArray = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap();
        charMap.put(charArray[start], 1);
        while (end<charArray.length){
            if(charMap.size()<k){
                end++;
                if(charMap.get(charArray[end]) == null){
                    charMap.put(charArray[end], 1);
                } else {
                    charMap.put(charArray[end], charMap.get(charArray[end]) + 1);
                }
            }
           else {
                if(charMap.size() == k){
                    maxSize = maxSize<(end-start+1)? end-start+1 : maxSize;
                    maxSizeStart = start;
                    maxSizeEnd = end;
                } else if(charMap.size()>k){
                    charMap.put(charArray[start], charMap.get(charArray[start])-1);
                    if(charMap.get(charArray[start]) == 0)
                        charMap.remove(charArray[start]);
                    start++;
                }
                end++;
                if(end<charArray.length){
                    if(charMap.get(charArray[end]) == null){
                        charMap.put(charArray[end], 1);
                    } else {
                        charMap.put(charArray[end], charMap.get(charArray[end] + 1));
                    }
                }
            }
        }
        return str.substring(maxSizeStart, maxSizeEnd+1);
    }
}
