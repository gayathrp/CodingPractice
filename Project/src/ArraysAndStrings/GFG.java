/**
 * Created by Gayathri on 11/19/16.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        String str = "hello";
        isUnique(str);
    }
    private static void isUnique(String input) {
        if(input == null) return;
        if(input.length() > 256) return;
        int count = 1;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < input.length() ; i++) {
            char value = input.charAt(i);
            if(!hmap.containsKey(value))
                hmap.put(value, count);
        }
        List<Character> list = new ArrayList<>(hmap.keySet());
        System.out.println(list.get(0) + " is the first unique character of the string");
    }
}
