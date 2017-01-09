import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
	public static void main(String args[]) {
		int [] nos = {2, 3, 1, 4};   //// 1 2 3 4 
		int []input = sort(nos);
		findSum(input, 5);
	}
	private static int[] sort(int [] input) {
		Arrays.sort(input);
		return input;
	}
	
	
	/// 1234
	
	
	public static boolean findSum(int [] input, int sum) {
		int first = 0;
		int last = input.length - 1;
		ArrayList<String> list = new ArrayList<>();
		while(first < last) {
			if(input[first] + input[last] == sum) {
				String s = input[first] + "," + input[last];
				list.add(s);
				first++;
			}	
			else if(input[first] + input[last] < sum)
				first++;
			else
				last--;
		}
		System.out.println(list);
		return false;
	}
}
