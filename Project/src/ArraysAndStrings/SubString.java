import java.util.ArrayList;
import java.util.HashMap;

public class SubString {
	public static void main(String args[]) {
		String input = "banana";
		ArrayList<String> list = getAllSubStrings(input, 2, 4);
		getOccurence(list, 1);
	}

	private static void getOccurence(ArrayList<String> input, int charCnt) {
		int count = 0;
		for(int i = 0 ; i < input.size() ; i++) {
			String str = input.get(i);
			HashMap<Character, Integer> map = new HashMap<>();
			for(int j = 0 ; j < str.length() ; j++) {
				if(map.containsKey(str.charAt(j)))
					map.put(str.charAt(j), map.get(str.charAt(j))+1);
				else
					map.put(str.charAt(j), 1);
			}
			if(countDistintChars(map) <= charCnt)
				count ++;
		}
		System.out.println(count);
	}

	private static int countDistintChars(HashMap<Character, Integer> map) {
		ArrayList<Character> list = new ArrayList<>();
		for(Character key : map.keySet()) {
			if(map.get(key) == 1)
				list.add(key);
		}
		System.out.println(list.size());
		return list.size();
	}

	private static ArrayList<String> getAllSubStrings(String input, int l, int k) {
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0 ; i < input.length() ; i++) {
			for(int j = 1 ; j <= input.length() - i ; j++) {
				if(input.substring(i, i+j).length() >= l && input.substring(i, i+j).length() <= k && !list.contains(input.substring(i, i+j)))
					list.add(input.substring(i, i+j));
			}
		}
		System.out.println(list);
		return list;
	}
}
