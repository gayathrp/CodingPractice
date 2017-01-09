
public class ZeroPadding {
	public static Node head;
	public static void main(String args[]) {
		ZeroPadding list = new ZeroPadding();
		list.head = new Node();
		Node two = new Node();
		Node three = new Node();
		head.data = 1;
		two.data = 2;
		three.data = 3;
		head.next = two;
		two.next = three;
		int len1 = length(head);
		int len2 = length(three);
		if(len1 < len2) 
			padZeros(three,len2 - len1);
		if(len2 < len1)
			padZeros(three,len1 - len2);
	}
	private static void padZeros(Node head, int len) {
		System.out.println("len"+len);
		for(int i = 0 ; i < len ; i++) {
			Node zero = new Node();
			zero.next = head;
			head = zero;
		}	
		printList(head);
	}
	private static int length(Node node) {
		int count = 0;
		while(node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
	private static void printList(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
