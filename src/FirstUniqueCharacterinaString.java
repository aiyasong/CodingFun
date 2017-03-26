/**
 * Created by taosong on 3/23/17.
 */
package com.github.aiyasong.codingfun.leetcode;

import java.util.*;

public class FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        int result = -1;

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i))){
                charMap.put(s.charAt(i),i);
            }
            else {
                charMap.put(s.charAt(i), -1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()){
                if (result == -1){
                    result = entry.getValue();
                }
                else if ((entry.getValue() < result) && (entry.getValue() > 0)){
                result = entry.getValue();
            }
        }







        return result;

    }
}
