

public class SubTree {
	public static void main(String args[]) {
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		Node five = new Node();
		Node six = new Node();
		Node seven = new Node();
		Node eight = new Node();
		one.data = 1;
		two.data = 2;
		three.data = 3;
		four.data = 4;
		five.data = 5;
		six.data = 6;
		seven.data = 7;
		eight.data = 8;
		one.left = two;
		one.right = three;
		two.left = four;
		four.left = eight;
		two.right = five;
		three.left = six;
		three.right = seven;
		getSubTree(one, three);
	}

	private static boolean getSubTree(Node one, Node three) {
		if(one == null) 
			return false;
		if(three == null) 
			return true;
		if(one.data == three.data) {
			 if(isSubTree(one, three))
				 System.out.println("Tree 2 is sub tree of Tree 1");
		}
		return getSubTree(one.left, three) || getSubTree(one.right, three);
	}

	private static boolean isSubTree(Node one, Node three) {
		if(one == null && three == null) {
			return true;
		}
		if(one.data == three.data) {
			System.out.println(one.data);
			boolean left = isSubTree(one.left, three.left);
			boolean right = isSubTree(one.right, three.right);
			return left && right;
		}
		return false;
	}
}
