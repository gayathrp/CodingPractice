import java.util.Stack;

/**
 * Created by Gayathri on 11/13/16.
 */
public class Palindrome {
    static Node head;

    public static void main(String args[]) {
        Palindrome list = new Palindrome();
        list.head = new Node();
        Node one = new Node();
        Node two = new Node();
        Node two1 = new Node();
        Node three = new Node();
        one.data = 1;
        head.data = 1;
        two.data = 2;
        two1.data = 2;
        head.next = two;
        two.next = two1;
        two1.next = one;
        printList(head);
        isPalindrome(head);
    }

    private static void printList(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void isPalindrome(Node root) {
        Node slow = root;
        Node fast = root;
        Stack<Integer> s = new Stack<>();
        while(fast != null && fast.next != null) {
            s.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) {
            slow = slow.next;
        }
        while(slow != null) {
            if(s.pop() == slow.data)
                slow = slow.next;
            else
                return;
        }
        System.out.println("The list is a palindrome");
    }
}
