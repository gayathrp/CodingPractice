import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class DuplicateList {
	public static Tree head;
	public static void main(String args []) {
		DuplicateList list = new DuplicateList();
		list.head = new Tree();
		Tree one = new Tree();
		Tree two = new Tree();
		Tree three = new Tree();
		Tree four = new Tree();
		head.data = 1;
		one.data = 2;
		two.data = 3;
		three.data = 2;
		four.data = 1;
		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		printList(head);
		removeDuplicates(head);
		printList(head);
	}
	
	private static void printList(Tree node) {
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	private static void removeDuplicates(Tree root) {
		if(root == null) return;
		Tree previous = null;
		ArrayList<Integer> list = new ArrayList<>();
		while( root != null) {
			if(list.contains(root.data)) {
				previous.next = root.next;
			}
			else {
				list.add(root.data);
				previous = root;
			}
			root = root.next;
		}
	}
}

