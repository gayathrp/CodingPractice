package ArraysAndStrings;

public class StringCompression {
	
	private static int count = 1;
	static String charstr = null;
	static String s = "";


	public static void main(String args[])
	{
		String str = "aabccccddde";
		char [] chars = new char [100];
		chars = str.toCharArray();
		Compress(chars);
	}
	

	public static void Compress(char [] chars)
	{
		for(int i=0; i<chars.length-1;i++)
		{		
			if(chars[i]==chars[i+1])
			{
				count = count + 1;
				charstr = chars[i]+""+count;
			}
			else
			{

				s = s+charstr;
				count = 1;
				charstr = chars[i+1]+""+count;
			}

		}
		s = s+charstr;
		System.out.println(s);
		if(s.length()>chars.length)
		{
			System.out.println(new String(chars));
		}
	}
}
