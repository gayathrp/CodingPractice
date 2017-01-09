import java.util.Stack;

public class PalindromeList {
	public static Node head;
	public static void main(String args[]) {
		PalindromeList list = new PalindromeList();
		list.head = new Node();
		Node two = new Node();
		Node three = new Node();
		Node two1 = new Node();
		Node one = new Node();
		head.data = 1;
		two.data = 2;
		three.data = 3;
		two1.data = 2;
		one.data = 1;
		head.next = two;
		two.next = three;
		three.next = two1;
		two1.next = one;
		printList(head);
		isPalindrome(head);
	}
	
	private static boolean isPalindrome(Node head) {
		if(head == null) return false;
		Stack s = new Stack<>();
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			s.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null)
			slow = slow.next;
		while(slow != null) {
			if(s.pop().equals(slow.data)) {
				slow = slow.next;
			}
			else
				return false;
		}
		System.out.println("List is a palindrome");
		return true;
	}

	private static void printList(Node node) {
		if(node == null) return;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}