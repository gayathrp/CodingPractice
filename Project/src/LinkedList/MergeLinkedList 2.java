public class MergeLinkedList {
	public static Node head;

	public static void main(String args[]) {
		MergeLinkedList list = new MergeLinkedList();
		list.head = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		Node five = new Node();
		Node six = new Node();
		Node seven = new Node();
		head.data = 1;
		two.data = 2;
		three.data = 3;
		four.data = 4;
		five.data = 5;
		six.data = 6;
		seven.data = 7;
		head.next = four;
		four.next = two;
		two.next = seven;
		seven.next = six;
		six.next = five;
		five.next = three;
		printList(head);
		System.out.println("New List");
		splitList(head, 5);
	}

	private static void printList(Node node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	private static void splitList(Node temp, int mid) {
		Node firstStart = null;
		Node firstEnd = null;
		Node secondStart = null;
		Node secondEnd = null;
		Node node = temp;
		while (node != null) {
			Node next = node.next;
			node.next = null;
			if (node.data < mid) {
				if (firstStart == null) {
					firstStart = node;
					firstEnd = firstStart;
				} else {
					firstEnd.next = node;
					firstEnd = node;
				}
			} else if(node.data >= mid) {
				if (secondStart == null) {
					secondStart = node;
					secondEnd = secondStart;
				} else {
					secondEnd.next = node;
					secondEnd = node;
				}
			}
			node = next;
		}
		if(firstStart == null) 
			printList(secondStart);
		else if(secondStart == null) 
			printList(firstStart);
		else
			firstEnd.next = secondStart;
		printList(firstStart);
		mergeList(firstStart, secondStart);
	}

	private static void mergeList(Node node1, Node node2) {
		Node list = new Node();
		Node node = list;
		while (node1 != null) {
			node.next = node1;
			node = node.next;
			node1 = node1.next;
		}
		while (node2 != null) {
			node.next = node2;
			node = node.next;
			node2 = node2.next;
		}
		list = list.next;
		printList(list);
	}
}
