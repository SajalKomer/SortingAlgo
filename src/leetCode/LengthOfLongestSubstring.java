package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public int listOfLongestSubString(String s){
        int stringLength = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j=0, i=0; j<stringLength; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(j), j+1);
        }
        return result;
    }
}
