package org.example.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CountOfAllAnagramsInString {
    public static void main(String[] args){
        String str = "forroforfxiyzq";
        String str1 = "for";
        System.out.println(countOfAnagrams(str, str1));
    }
    public static int countOfAnagrams(String str, String str1){
        int countOfAnagrams = 0;
        Map<Character, Integer> str1Map = new HashMap<>();
        char[] str1CharArray = str1.toCharArray();
        for(int i=0; i< str1CharArray.length;i++){
            if(str1Map.get(str1CharArray[i]) == null)
                str1Map.put(str1CharArray[i], 1);
            else
                str1Map.put(str1CharArray[i], str1Map.get(str1CharArray[i])+1);
        }
        char[] strCharArray = str.toCharArray();
        Map<Character, Integer> strMap = new HashMap<>();
        int start =0, end=0;
        strMap.put(strCharArray[start],1);
        while (end<strCharArray.length){
            if(end-start+1 < str1.length()){
              end++;
              if(strMap.get(strCharArray[end]) == null)
                  strMap.put(strCharArray[end], 1);
              else
                  strMap.put(strCharArray[end], strMap.get(strCharArray[end])+1);
            } else if(end-start+1==str1.length()){
                boolean isAnagram = true;
                for(Map.Entry<Character,Integer> map: str1Map.entrySet()){
                    if(map.getValue() != strMap.get(map.getKey())){
                        isAnagram = false;
                        break;
                    }
                }
                if(isAnagram)
                    countOfAnagrams+= 1;
                if(strMap.get(strCharArray[start]) != null){
                    if(strMap.get(strCharArray[start]) == 1)
                        strMap.remove(strCharArray[start]);
                    else
                        strMap.put(strCharArray[start], strMap.get(strCharArray[start])-1);
                }
                start++;
                end++;
                if(end<strCharArray.length){
                    if(strMap.get(strCharArray[end]) == null)
                        strMap.put(strCharArray[end],1);
                    else
                        strMap.put(strCharArray[end],strMap.get(strCharArray[end])+1);
                }
            }
        }
        return countOfAnagrams;
    }
}
