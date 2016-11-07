package ArraysAndStrings;

public class RotateString {

	public static void main(String args[]) {
		isRotatedString("gayathri", "thriga");
	}

	public static boolean isSubstring(String string1, String string2) {
		if(string1 == null || string2 == null)
			return false;
		
		if (string1.length() < string2.length())
			return false;

		for (int i = 0; i < string1.length(); i++) {
			for (int j = string1.length(); j >= 0; j--) {
				if (j <= i)
					continue;
				
				System.out.println(string1.substring(i, j));
				if (string1.substring(i, j).equals(string2)) {
					System.out.println("yes");
					return true;
				}

			}
		}
		return true;
	}

	public static void isRotatedString(String string1, String string2) {
		String string11 = string1 + string1;
		if (isSubstring(string11, string2)) {
			System.out.println("yes string s2 is rotated string of s1");
		} else {
			System.out.println("no string s2 is not rotated string of s1");
		}
	}
}
