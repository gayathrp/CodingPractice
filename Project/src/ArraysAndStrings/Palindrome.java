package ArraysAndStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import Utilities.StringUtils;
public class Palindrome {
			public static void main (String args[])
			{
				ArrayList<String> input = new ArrayList<String>(Arrays.asList("abaaabaaaba", "baaa", "aaab", "baaab"));
				longestPalindrome(input);
			}
			public static int longestPalindrome(ArrayList<String> str) {
				
				HashMap<String, String> hmap = new HashMap<>();
				for(int i = 0 ; i < str.size() ; i++)
				{
					String reverseSr = StringUtils.Reverse(str.get(i));
					if(str.get(i).equals(reverseSr))
					{
						hmap.put(str.get(i), reverseSr);
					}
					else
						continue;
				}
				System.out.println(hmap.keySet() + " are palindromes");
				return 1;
		        
		    }
			 
}
