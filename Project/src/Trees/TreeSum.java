import java.lang.reflect.Array;
import java.util.ArrayList;

public class TreeSum {
	private static ArrayList<String> list = new ArrayList<>();
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
		findSum(one, 7);
		System.out.println(list);
	}

	private static void findSum(Node one, int sum) {
		int height = height(one);
		int path[] = new int[height];
		findSum(one, sum, path, 0);
	}

	private static void findSum(Node one, int sum, int[] path, int level) {
		if(one == null) 
			return;
		path[level] = one.data;
		int sumOfNodes = 0;
		for(int i = level ; i >= 0 ; i--) {
			sumOfNodes += path[i];
			if(sumOfNodes == sum)
				addPath(path, i, level);
		}
		findSum(one.left, sum, path, level+1);
		findSum(one.right, sum, path, level+1);
	}

	private static void addPath(int[] path, int start, int end) {
		StringBuffer str = new StringBuffer();
		for(int i = start ; i <= end ; i++) {
			str.append(path[i]);
		}
		list.add(str.toString());
	}

	private static int height(Node one) {
		if(one == null)
			return 0;
		return Math.max(height(one.left), height(one.right)) + 1;
	}
}
