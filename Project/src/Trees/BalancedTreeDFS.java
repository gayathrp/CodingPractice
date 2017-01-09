import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Gayathri on 11/6/16.
 */
public class BalancedTreeDFS {
    public static void main(String args[])
    {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        Node five = new Node();
        Node six = new Node();
        one.data = 1;
        two.data = 2;
        three.data = 3;
        four.data = 4;
        five.data = 5;
        six.data = 6;
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        four.left = six;
        isBalanced(one);
    }

    private static int getHeight(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = 0;
        while(!q.isEmpty())
        {
            height++;
            int count = q.size();

            while(count > 0)
            {

                Node temp = q.poll();
                if(temp.left != null)
                q.add(temp.left);
                if(temp.right != null)
                q.add(temp.right);
                count--;
            }
        }
        return height;
    }

    private static void isBalanced(Node root)
    {
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if(leftHeight-rightHeight > 1)
            System.out.println("Tree is not balanced");
        else System.out.println("Tree is balanced with height " + getHeight(root));
    }
}
