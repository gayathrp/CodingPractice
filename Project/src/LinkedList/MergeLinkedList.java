/**
 * Created by Gayathri on 11/13/16.
 */

public class MergeLinkedList {
    public static Node head;
    public static void main(String args[])
    {
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
        six.next = three;
        three.next = five;
        printList(head);
        System.out.println("New List");
        splitList(head, 5);
    }

    private static void printList(Node node) {
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static void splitList(Node node, int mid) {
        Node beforeMidStart = null;
        Node beforeMidEnd = null;
        Node afterMidStart = null;
        Node afterMidEnd = null;
        Node temp = node;
        while(temp != null) {
            if(temp.data < mid) {
                if(beforeMidEnd != null) {
                    beforeMidEnd.next = temp;
                    beforeMidEnd = beforeMidEnd.next;
                }
                else {
                    beforeMidStart = temp;
                    beforeMidEnd = beforeMidStart;
                }
            }
            else if(temp.data >= mid) {
                if(afterMidEnd != null) {
                    afterMidEnd.next = temp;
                    afterMidEnd = afterMidEnd.next;
                }
                else {
                    afterMidStart = temp;
                    afterMidEnd = afterMidStart;
                }
            }
            temp = temp.next;
        }
        beforeMidEnd.next = null;
        afterMidEnd.next = null;
        mergeList(beforeMidStart, afterMidStart);

    }

    private static void mergeList(Node node1, Node node2) {
        Node list = new Node();
        Node node = list;
        while(node1 != null) {
            node.next = node1;
            node = node.next;
            node1 = node1.next;
        }
        while(node2 != null) {
            node.next = node2;
            node = node.next;
            node2 = node2.next;
        }
        list = list.next;
        printList(list);
    }
}

