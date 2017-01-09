import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Created by Gayathri on 11/6/16.
 */
public class NodesinEachLevel {
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
        nodesInLevel(one);
    }

    private static void nodesInLevel(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList list = new ArrayList<>();
        list.add(root.data);
        HashMap<Integer, ArrayList> map = new HashMap<>();
        int height = 0;
        while(!q.isEmpty())
        {
            height++;
            map.put(height, list);
            int count = q.size();
            list = new ArrayList<>();
            while(count > 0)
            {
                Node temp = q.poll();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                    list.add(temp.left.data);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                    list.add(temp.right.data);
                }
                count--;
            }
        }
        System.out.println(map);
    }
}

