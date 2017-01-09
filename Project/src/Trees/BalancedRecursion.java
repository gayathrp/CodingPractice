
public class BalancedRecursion {
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
		four.left = six;
		if(height(one) != -1)
			System.out.println("Tree is balanced");
	}

	private static int height(Node node) {
		if(node == null) 
			return 0;
		int left = height(node.left);
		System.out.println("Left"+left);
		int right = height(node.right);
		System.out.println("Right"+right);
		System.out.println(Math.abs(left - right));
		if(Math.abs(left - right) > 1)
			return -1;
		return Math.max(left, right) + 1;
	}
}
