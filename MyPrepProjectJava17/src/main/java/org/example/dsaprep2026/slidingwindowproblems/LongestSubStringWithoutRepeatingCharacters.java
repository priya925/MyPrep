package org.example.dsaprep2026.slidingwindowproblems;

import java.util.HashSet;
import java.util.Set;
public class LongestSubStringWithoutRepeatingCharacters {

    public static void main(String[] args){
        String str = "pwwkew";
        int left =0;

        int stringLengthWithoutRepeatingCharacter = 0;
        Set<Character> charSet = new HashSet<>();
        for(int right=0; right<str.length(); right++){
            while(charSet.contains(str.charAt(right))){
                charSet.remove(str.charAt(left));
                left++;
            }
            charSet.add(str.charAt(right));
            stringLengthWithoutRepeatingCharacter = Math.max(stringLengthWithoutRepeatingCharacter, right-left+1);
        }
        System.out.println("Longest substring without repeating characters length is "+ stringLengthWithoutRepeatingCharacter);
    }
}
