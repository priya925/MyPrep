package org.example;

import java.util.Map;
import java.util.TreeMap;

public class RearrangeStringWithNoAdjacentCharacters {

    public static void main(String[] args){
        String str = "aaabbbdecccc";
        System.out.println(reaarangeString(str));
    }

    static String reaarangeString(String str){
        Map<Character, Integer> charFrequencyMap = new TreeMap<>();
        int largestFrequency = 0;
        for(Character c: str.toCharArray()){
            if(charFrequencyMap.get(c) == null){
                charFrequencyMap.put(c, 1);
            } else {
                charFrequencyMap.put(c, charFrequencyMap.get(c)+1);
                if(largestFrequency < charFrequencyMap.get(c)){
                    largestFrequency = charFrequencyMap.get(c);
                }
            }
        }
        if(largestFrequency > (str.length()+1)/2)
            return "This string has no solution";
        Character[] charArray = new Character[str.length()];
        for(Map.Entry<Character, Integer> map: charFrequencyMap.entrySet()){
            for(int i=0; i<str.length(); i=i+2 ){
                if(charArray[i] == null && map.getValue() != 0){
                    charArray[i] = map.getKey();
                    charFrequencyMap.put(map.getKey(), map.getValue()-1);
                }
            }
            for(int i=1; i<str.length(); i=i+2 ){
                if(charArray[i] == null && map.getValue() != 0){
                    charArray[i] = map.getKey();
                    charFrequencyMap.put(map.getKey(), map.getValue()-1);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: charArray){
            sb.append(c);
        }
        return sb.toString();
    }



}

