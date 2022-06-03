import java.util.*;

public class isogram {
    public static boolean  isIsogram(String str) {
        String s = str.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++)
        {
           char c = s.charAt(i);
           if (hashMap.containsKey(c))
           {
             return false;
           }
           else 
           {
             hashMap.put(c, 1);
           }
        }
        return true;
    } 
}
