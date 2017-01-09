import java.util.ArrayList;

public class FindSubTree {
	private static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String args[]) {
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		Node five = new Node();
		Node six = new Node();
		Node seven = new Node();
		Node eight = new Node();
		Node nine = new Node();
		one.data = 25;
		two.data = 19;
		three.data = 37;
		four.data = 12;
		five.data = 22;
		six.data = 4;
		seven.data = 23;
		eight.data = 29;
		nine.data = 30;
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		four.left = six;
		five.right = seven;
		three.left = eight;
		eight.right = nine;
		Node ten = new Node();
		Node eleven = new Node();
		Node twelve = new Node();
		ten.data = 37;
		eleven.data = 29;
		twelve.data = 30;
		ten.left = eleven;
		eleven.right = twelve;
		findSubtree(one, ten);
		findSubtreeInRange(one, 29, 30);
		System.out.println(list);
	}

	private static boolean findSubtreeInRange(Node one, int i, int j) {
		boolean right = false;
		boolean left = false;
		
		if (one == null)
			return true;
		if (one.data < i)
			return findSubtreeInRange(one.right, i, j);
		if (one.data > j)
			return findSubtreeInRange(one.left, i, j);
		
		right = findSubtreeInRange(one.right, i, j);
		left = findSubtreeInRange(one.left, i, j);

		if (left && right) {
			list.add(one.data);
			return true;
		}
		return false;
	}

	private static void findSubtree(Node one, Node ten) {
		if (one == null || ten == null)
			return;
		if (one.data == ten.data) {
			if (isSubTree(one, ten))
				System.out.println("ten is subtree of one");
		}
		findSubtree(one.left, ten);
		findSubtree(one.right, ten);
	}

	private static boolean isSubTree(Node one, Node ten) {
		if (one == null && ten == null)
			return true;
		if (one.data == ten.data)
			return isSubTree(one.left, ten.left) && isSubTree(one.right, ten.right);
		return false;
	}
}
