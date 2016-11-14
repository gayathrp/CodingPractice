class LinkedList{
    static Node head;
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.head = new Node();
        Node zero = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        Node five = new Node();
        zero.data = 0;
        head.data = 1;
        two.data = 2;
        three.data = 3;
        four.data = 4;
        five.data = 5;
        head.next = two;
        two.next = four;
        insertNode(zero); // insert as first node
        insertMiddleNode(two, three); // insert in the middle
        insertLastNode(four, five); // insert as last node
        deleteNode(zero, 5); // delete last node
        printList();
    }

    private static void printList()
    {
        Node n = head;
        if(n == null) return;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    private static void insertNode(Node zero)
    {
        zero.next = head;
        head = zero;
    }
    private static void insertMiddleNode(Node two, Node three)
    {
        three.next = two.next;
        two.next = three;
    }
    private static void insertLastNode(Node four, Node five)
    {
        five.next = null;
        four.next = five;
    }

    private static void deleteNode(Node zero, int data)
    {
        Node n = zero;
        while(n != null)
        {
            if(n.next.data == data)
            {
                if(n.next.next != null)
                    n.next = n.next.next;
                else
                    n.next = null;
            }
            n = n.next;
        }
    }
}

