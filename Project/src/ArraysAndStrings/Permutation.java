import java.util.Arrays;

public class Permutation {
	public static void main(String args[]) {
		String str1 = "apple";
		String str2 = "eppla";
		isPermutation(str1, str2);
	}


	private static boolean isPermutation(String input1, String input2) {
		if(input1 == null) return false;
		if(input2 == null) return false;
		if(input1.length() != input2.length()) return false;
		if(sort(input1).equals(sort(input2)))
		{
			System.out.println("Two strings are equal");
			return true;
		}
		else
			return false;
	}
	private static String sort(String input) {
		char [] str = input.toCharArray();
		Arrays.sort(str);
		return new String(str);
	}
}
