import java.util.Arrays;
import java.util.Stack;


public class InOrder {
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
		four.left = two;
		four.right = six;
		two.left = one;
		two.right = three;
		six.left = five;
		six.right = seven;
		printTree(four);
	}
	private static void printTree(Node node) {
		Stack<Node> s = new Stack<>();
		StringBuffer str = new StringBuffer();
		while(node != null) {
			s.push(node);
			node = node.left;
		}
		
		while(!s.isEmpty()) {
			Node temp = s.pop();
			str.append(temp.data);
			if(temp.right != null) {
				temp = temp.right;
				while(temp != null) {
					s.push(temp);
					temp = temp.left;
				}
			}
		}
		isBST(str.toString());
	}
	private static void isBST(String string) {
		char[] input = string.toCharArray();
		Arrays.sort(input);
		if(new String(input).equalsIgnoreCase(string))
			System.out.println("Binary Tree is Binary Search Tree");
		
	}
}

