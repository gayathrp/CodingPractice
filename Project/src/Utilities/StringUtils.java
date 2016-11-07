package Utilities;

import java.util.Arrays;

public class StringUtils {
	public final static String Sort(String input) {

		char[] chararray = input.toCharArray();
		Arrays.sort(chararray);
		return new String(chararray);

	}

	public final static String Reverse(String inputStr)
    {
    char[] str = inputStr.toCharArray();
    char[] outputStr = new char[inputStr.length()];
    int count = 0;
   
    for(int i = str.length-1 ; i >= 0 ; i--)
        {
    	outputStr[count] = str[i];
    	count++;
    }
    return new String(outputStr);
}
}
