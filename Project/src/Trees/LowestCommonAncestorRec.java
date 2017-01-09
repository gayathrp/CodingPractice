import java.util.ArrayList;


public class LowestCommonAncestorRec {
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
		System.out.println(getLeastCommonAncestor(one, 4, 5).data);
	}

	private static Node getLeastCommonAncestor(Node one, int i, int j) {
		if(one == null) return null;
		if(one.data == i || one.data == j)
			return one;
		Node left = getLeastCommonAncestor(one.left, i, j);
		Node right = getLeastCommonAncestor(one.right, i, j);
		if(left != null && right != null)
			return one;
		return (left != null) ? left : right;	
	}
}
