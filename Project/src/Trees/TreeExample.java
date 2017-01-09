import java.util.ArrayList;
import java.util.Stack;

public class TreeExample {
	public static void main(String args []) {
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
		Node start = findStart(one, "25");
		System.out.println(start.data);
		isTarget(start, "25");
	}
	
	private static Node findStart(Node node, String input) {
		if(node == null) return null;
		Stack<Node> s = new Stack<>();
		s.push(node);
		while(!s.isEmpty()) {
			Node temp = s.pop();
			if(temp.data == Character.getNumericValue(input.charAt(0))) 
				return temp;
			if(temp.left != null)
				s.push(temp.left);
			if(temp.right != null) 
				s.push(temp.right);
		}
		return null;
	}
	
	public static void isTarget(Node node, String input) {
		if(node == null) return;
		for(int i = 1 ; i < input.length() ; i++) {
			if(node.data == Character.getNumericValue(input.charAt(i)))
				break;
			else if(node.left != null && node.left.data == Character.getNumericValue(input.charAt(i)))
				node = node.left;
			else if(node.right != null && node.right.data == Character.getNumericValue(input.charAt(i)))
				node = node.right;
			else {
				System.out.println("FALSE");
				return;
			}
		}
		System.out.println("TRUE");
		
	}
}
