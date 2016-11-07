package ArraysAndStrings;
import java.util.Arrays;
import Utilities.StringUtils;
public class Permutation {

	public static void main(String args[])
	{
		String str11=null;
		isPermutation("abcd","dcaba");
	}
	public static boolean isPermutation(String str1, String str2)
	{
		String sortedStr1 = StringUtils.Sort(str1);
		String sortedStr2 = StringUtils.Sort(str2);
		if(sortedStr1.equals(sortedStr2))
		{
			System.out.println("Yes - strings are equal");
			return true;
		}
		else
		{
			System.out.println("No - strings are not equal");
			return false;
		}
	}
	
}
