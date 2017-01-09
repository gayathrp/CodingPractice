import java.util.ArrayList;
import java.util.Stack;

public class LeastCommonAncestor {
	public static void main(String args[]) {
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		Node five = new Node();
		Node six = new Node();
		Node seven = new Node();
		one.data = 1;
		two.data = 2;
		three.data = 3;
		four.data = 4;
		five.data = 5;
		six.data = 6;
		seven.data = 7;
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		int paths[] = new int[500];
		ArrayList<String> list = new ArrayList<>();
		getPath(one, four, paths, 0, list);
		getPath(one, five, paths, 0, list);
		getLeastCommonAncestor(list);
	}
	
	private static void getPath(Node source, Node dest, int[] paths, int len, ArrayList<String> list) {
		if(source == null) return;
		paths[len] = source.data;
		len++;
		if(source == dest)
			list.add(printPath(paths, len));
		else {
			getPath(source.left, dest, paths, len, list);
			getPath(source.right, dest, paths, len, list);
		}	
	}
	
	private static String printPath(int[] paths, int len) {
		StringBuffer str = new StringBuffer();
		for(int i = 0 ; i < len ; i++) 
			str.append(paths[i]);
		return str.toString();
	}
	
	private static void getLeastCommonAncestor(ArrayList<String> list) {
		System.out.println(list);
		String str1 = list.get(0);
		String str2 = list.get(1);
		for(int i = 0 ; i < str1.length() ; i++) {
			for(int j = 0 ; j < str2.length() ; j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					System.out.println(str1.charAt(i));
				}
			}
		}
	}
}
