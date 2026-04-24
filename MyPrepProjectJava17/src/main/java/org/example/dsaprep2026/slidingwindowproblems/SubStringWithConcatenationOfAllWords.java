package org.example.dsaprep2026.slidingwindowproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SubStringWithConcatenationOfAllWords {

    public static void main(String[] args){

        List<String> givenList = List.of("foo", "bar", "the");
        String str = "barfoothefoobar";
        List<Integer> result = findStartIndicesIfSubstringExist(givenList, str);
        for(int val : result){
            System.out.println(val);
        }
    }

    static List<Integer> findStartIndicesIfSubstringExist(List<String> words, String str){
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for(String word: words){
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0)+1);
        }

        int wordLength = words.get(0).length();
        int windowSize = wordLength*words.size();

        for(int i=0 ; i<=str.length()-windowSize; i++){
            Map<String, Integer> wordFoundInStringMap = new HashMap<>();
            int j=0;
            while(j<words.size()){
                int start = i+j*wordLength;
                String subString = str.substring(start, start+wordLength);
                if(!wordFrequencyMap.containsKey(subString)) break;
                wordFoundInStringMap.put(subString, wordFoundInStringMap.getOrDefault(subString, 0)+1);
                if(wordFoundInStringMap.get(subString)>wordFrequencyMap.get(subString)) break;
                j++;
            }
            if(j==words.size()) result.add(i);
        }
        return result;
    }
}
