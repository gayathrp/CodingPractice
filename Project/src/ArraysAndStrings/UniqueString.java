package ArraysAndStrings;
public class UniqueString {
	
	public static void main(String args[]) {
		isUniqueChars2("abcae");

	}
public static boolean isUniqueChars2(String str)
{
	if(str.length()>=256)
		return false;
	boolean values[]=new boolean [256];
	for(int i =0; i<str.length() ; i++)
	{
		int val=str.charAt(i);
		if(values[val])
		{
			System.out.println("string does not have all unique values");
			return false;
		}
		values[val] = true;
	}
		return true;
	
}
}
