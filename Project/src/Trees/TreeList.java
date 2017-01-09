import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeList {
	public static void main (String args[]) {
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
		//three.right = seven;
		bfs(one);
	}

	private static void bfs(Node node) {
		if(node == null) return;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		ArrayList<LinkedList<Integer>> lists = new ArrayList<>();
		LinkedList<Integer> list = new LinkedList<>();
		list.add(node.data);
		lists.add(list);
		while(!q.isEmpty()) {
			int count = q.size();
			list = new LinkedList<>();
			while(count > 0) {
				Node temp = q.remove();
				if(temp.left != null) {
					q.add(temp.left);
					list.add(temp.left.data);
				}
				if(temp.right != null) {
					q.add(temp.right);
					list.add(temp.right.data);
				}
				if(temp.left == null && temp.right == null)
					list = null;
				count--;
			}
			if(list != null)
				lists.add(list);	
		}
		System.out.println(lists);
	}
}

