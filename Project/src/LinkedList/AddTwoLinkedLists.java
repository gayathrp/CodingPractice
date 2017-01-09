/**
 * Created by Gayathri on 11/14/16.
 */
public class AddTwoLinkedLists {
    static Node head1;
    static Node head2;
    public static void main(String args[]) {
        AddTwoLinkedLists list1 = new AddTwoLinkedLists();
        AddTwoLinkedLists list2 = new AddTwoLinkedLists();
        list1.head1 = new Node();
        Node one = new Node();
        Node seven = new Node();
        list2.head2 = new Node();
        Node nine = new Node();
        Node five = new Node();
        head1.data = 6;
        one.data = 1;
        seven.data = 7;
        head2.data = 2;
        nine.data = 9;
        five.data = 5;
        head1.next = one;
        one.next = seven;
        head2.next = nine;
        nine.next = five;
        System.out.println("List 1");
        printList(head1);
        System.out.println("List 2");
        printList(head2);
        addLists(head1,head2);
    }

    private static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.print("\n");
    }

    private static void addLists(Node node1, Node node2) {
        Node result = null;
        Node temp = null;
        Node previous = null;
        int carry = 0, sum;
        while(node1 != null || node2 != null) {
            sum = carry + (node1 != null ? node1.data : 0) + (node2 != null ? node2.data : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            Node sumNode = new Node();
            sumNode.data = sum;
            temp = sumNode;
            if(result == null) {
                result = temp;
            }
            else {
                previous.next = temp;
            }
            previous = temp;
            if(node1 != null)
                node1 = node1.next;
            if(node2 != null)
                node2 = node2.next;
        }
        if(carry > 0) {
            Node carryNode = new Node();
            carryNode.data = carry;
            temp.next = carryNode;
        }
        System.out.println("List 1 + List 2");
        printList(result);
    }
}
