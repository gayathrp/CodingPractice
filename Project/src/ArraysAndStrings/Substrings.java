import java.util.ArrayList;
import java.util.List;

public class Substrings {
    public static void main(String args[]) {
        String str1 = "hello";
        String str2 = "lohe";
        String str = str1+str1;
        isSubstring(str, str2);
    }
    private static boolean isSubstring(String str, String subStr) {
        if(subString(str).contains(subStr)) {
            System.out.println("String2 is a rotation of string1");
            return true;
        }
        else
            return false;
    }
    private static List<String> subString(String input) {
        String substring = new String();
        List<String> set = new ArrayList<>();
        for(int i = 0; i < input.length() ; i++) {
            for(int j = 1 ; j <= input.length() - i ; j++) {
                substring = input.substring(i, j+i);
                set.add(substring);
            }
        }
        System.out.println(set);
        return set;
    }
}
