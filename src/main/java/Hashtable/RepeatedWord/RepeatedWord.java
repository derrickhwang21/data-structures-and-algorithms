package Hashtable.RepeatedWord;

import Hashtable.Hashtable;

import java.util.HashSet;

public class RepeatedWord {

    /**
     * Code Challenge - 12: Repeated_Words
     */
    public static String getRepeatedWords(String input){
    // credit: Sooze for regex string with ^ carrot implementation
    String[] words = input.split("[^A-z]");

    HashSet<String> table = new HashSet<>();
        for(String word : words){
            if(table.contains(word)){
                return word;
            }else{
                table.add(word);
            }
        }
            return "no repeat";
    }
}
