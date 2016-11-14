import java.util.*;

/**
 * Created by Gayathri on 11/8/16.
 */
public class ReverseLinkedList {
    static Node head;
    public static void main(String args[])
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        Node five = new Node();
        head.data = 1;
        two.data = 2;
        three.data = 3;
        four.data = 4;
        five.data = 5;
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        splitList(head);

    }

    private static void printList(Node node) {
        Node temp = node;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void splitList(Node node) {
        Node slow = node;
        Node fast = slow.next;
        while(fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node node1 = node;
        Node node2 = slow.next;
        slow.next = null;
        rearrangeList(node1, reverseList(node2));
    }

    private static Node reverseList(Node node)
    {
        Node previous = null;
        Node current = node;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;
        return node;
    }

    private static void rearrangeList(Node node1, Node node2)
    {
        Node node = new Node();
        Node newList = node;
        while(node1 != null) {
            if(node1 == null) break;
            newList.next = node1;
            newList = newList.next;
            node1 = node1.next;
        }
        while(node2 != null) {
            if(node2 == null) break;
            newList.next = node2;
            newList = newList.next;
            node2 = node2.next;
        }
        node = node.next;
        printList(node);
    }
}
