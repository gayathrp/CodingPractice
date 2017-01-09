import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Gayathri on 11/10/16.
 */
public class BinarySearchTree {
    public static void main(String args[]) {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        Node five = new Node();
        one.data = 1;
        two.data = 2;
        three.data = 3;
        four.data = 4;
        five.data = 5;
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        isBST(one);
    }

    private static void isBST(Node root)
    {
        ArrayList<Node> list = inOrder(root);
    }

    private static ArrayList<Node> inOrder(Node root) {
        Stack<Node> s = new Stack<>();
        Node node = root;
        while(node != null) {
            s.push(node);
            node = node.left;
        }
        while (!s.isEmpty()) {
            node = s.pop();
            System.out.println(node.data);
            if(node.right != null)
            {
                node = node.right;
                while(node != null) {
                    s.push(node);
                    node = node.left;
                }

            }
        }
        return null;
    }
}

class Node{
    Object data;
    Node left;
    Node right;
}