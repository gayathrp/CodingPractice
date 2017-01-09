
public class BalancedTree {
	public static void main(String args[]) {
		Tree one = new Tree();
		Tree two = new Tree();
		Tree three = new Tree();
		Tree four = new Tree();
		Tree five = new Tree();
		Tree six = new Tree();
		Tree seven = new Tree();
		Tree eight = new Tree();
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
		int no = height(one);
		System.out.println(no);
		if(isBalanced(three))
			System.out.println("Tree is balanced");;
	}

	private static boolean isBalanced(Tree node) {
		if(node == null) return true;
		int left = height(node.left);
		int right = height(node.right);
		if(left - right <= 1 && isBalanced(node.left) && isBalanced(node.right))
			return true;
		else 
			return false;
	}

	private static int height(Tree node) {
		if(node == null) return 0;
		else 
			return 1 + Math.max(height(node.left), height(node.right));
		
		
	}
}
