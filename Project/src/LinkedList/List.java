
public class List {
	public static Node head;
	public static void main(String args[]) {
		List list = new List();
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
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = head;
		findMiddleNode(head);
	}
	
	private static void printList(Node node) {
		Node temp = node;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	private static void findMiddleNode(Node node) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		System.out.println(slow.data);
		slow = node;
		while(slow != fast)
		{
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println(fast.data);
	}
}

