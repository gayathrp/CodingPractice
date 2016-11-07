package ArraysAndStrings;
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import Utilities.StringUtils;
public class PalindromeStr {
	public static void main(String args[]) throws IOException
	{
		palindrome("aabaa");
	}
	static int palindrome(String str) throws IOException {
		if(str.equals(null) || str.isEmpty() || str.length() > 5000) throw new IOException();
        HashSet<String> set = new HashSet<>();
        char[] string = str.toCharArray();
            for(int i = 0; i < str.length() ; i++)
                {
                if(string[i] < 'a' || string[i] > 'z')
                    throw new IOException();
                for(int j = 2 ; j <= str.length()-i ; j++)
                    {
                	String subStr = str.substring(i,i+j);
                	String revStr = StringUtils.Reverse(subStr);
                    if(subStr.equals(revStr))
                    	set.add(subStr);
            
                }
            }
        System.out.println(set);
        return set.size();
    }
   
}
