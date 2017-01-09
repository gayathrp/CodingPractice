
public class SinglyLinkedList {
	public static Node head;
	public static void main(String args []) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.head = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		head.data = 1;
		two.data = 2;
		three.data = 3;
		four.data = 4;
		head.next = two;
		two.next = three;
		three.next = four;
		printList(head);
		findKthElement(head, 4);
	}
	private static void printList(Node node) {
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	private static void findKthElement(Node node, int k) {
		Node runner = node;
		Node current = node;
		for (int i = 1 ; i < k ; i++) {
			runner = runner.next;
		}
		System.out.println(runner.data);
		while(runner.next != null) {
			current = current.next;
			runner = runner.next;
		}
		System.out.println(current.data);
	}
}