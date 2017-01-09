public class uniqueCharacters {
	public static void main(String args[]) {
		String str = "abcde";
		isUnique(str);
}
	private static boolean isUnique(String input) {
		if(input == null) 
			return false; 
		boolean chars[] = new boolean[256];
for(int i = 0 ; i < input.length() ; i++) {
	if(chars[input.charAt(i)]) {
	return false;
}
	chars[input.charAt(i)] = true;
}
System.out.println("String has all unique characters"); 
return true;
	}
}