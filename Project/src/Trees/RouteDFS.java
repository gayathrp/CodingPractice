package Trees;
import java.util.ArrayList;
import java.util.Stack;

public class RouteDFS {
	
	public static void main(String args[])
	{
		TreeNode a = new TreeNode();
		TreeNode b = new TreeNode();
		TreeNode c = new TreeNode();
		TreeNode d = new TreeNode();
		TreeNode e = new TreeNode();
		TreeNode f = new TreeNode();
		TreeNode g = new TreeNode();
		TreeNode h = new TreeNode();
		a.data = 'A';
		b.data = 'B';
		c.data = 'C';
		d.data = 'D';
		e.data = 'E';
		f.data = 'F';
		g.data = 'G';
		h.data = 'H';
		a.children.add(b);
		a.children.add(c);
		b.children.add(d);
		c.children.add(e);
		d.children.add(f);
		e.children.add(g);
		isRoute(a,a,h);
	}
	
	private static ArrayList<TreeNode> Route(TreeNode root)
	{
		TreeNode temp = new TreeNode();
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		ArrayList<TreeNode> route = new ArrayList<>();
		route.add(root);
		while(!s.isEmpty())
		{
			temp = s.pop();
			for(int i = 0; i < temp.children.size() ; i++)
			{
				s.push(temp.children.get(i));
				route.add(temp.children.get(i));
			}
		}
		
		return route;
		
	}
	
	private static void isRoute(TreeNode root, TreeNode A, TreeNode B)
	{
		if(Route(root).contains(A) && Route(root).contains(B))
		{
			System.out.println("There is route between "+A.data+" and "+B.data);
		}
		else
		{
			System.out.println("There is no route between "+A.data+" and "+B.data);
		}
	}
}


