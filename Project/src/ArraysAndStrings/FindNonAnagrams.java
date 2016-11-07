package ArraysAndStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import Utilities.StringUtils;

public class FindNonAnagrams {
	public static void main(String args[]) {
		ArrayList<String> input = new ArrayList<String>(Arrays.asList("abc", "bca", "cba", "yzx", "ghi", "ihg"));

		HashMap<String, ArrayList<String>> map = getMap(input);

		for (String key : map.keySet()) {
			if (map.get(key).size() == 1)
				System.out.println(map.get(key) + " is a Non-Anagram");
		} 
	}

	private static HashMap<String, ArrayList<String>> getMap(ArrayList<String> input) {
		HashMap<String, ArrayList<String>> hmap = new HashMap<>();

		for (int i = 0; i < input.size(); i++) {
			String str = input.get(i);
			String sortedStr = StringUtils.Sort(str);
			if (hmap.containsKey(sortedStr)) {
				hmap.get(sortedStr).add(str);
			} else {
				ArrayList<String> unsortedList = new ArrayList<>();
				unsortedList.add(str);
				hmap.put(sortedStr, unsortedList);
			}
		}
		return hmap;
	}

}
