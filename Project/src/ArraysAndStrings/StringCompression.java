public class StringCompression {
	public static void main(String args[]) {
		String str = "aabbbccccddddd";
		if(compress(str).length() > str.length()) {
			System.out.println(str);
		}
	}
	private static String compress(String input) {
		StringBuffer str = new StringBuffer();
		char last = input.charAt(0);
		int count = 1;
		for(int i = 1 ; i < input.length() ; i++) {
			if(input.charAt(i) == last) {
				count++;
			}
			else {
				str.append(last);
				str.append(count);
				count = 1;
				last = input.charAt(i);
			}
		}
		str.append(last);
		str.append(count);
		System.out.println(str.toString());
		return str.toString();
	}
}
