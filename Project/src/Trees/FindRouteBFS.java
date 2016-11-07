package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/// find route from a to e
public class FindRouteBFS {
	static TreeNode temp;
	static TreeNode child;
	static TreeNode end;
	static ArrayList<TreeNode> route = new ArrayList<>();
	
	public static void main(String args[]) throws Exception
	{
		TreeNode a = new TreeNode();
		TreeNode b = new TreeNode();
		TreeNode c = new TreeNode();
		TreeNode d = new TreeNode();
		TreeNode e = new TreeNode();
		TreeNode f = new TreeNode();
		TreeNode g = new TreeNode();
		a.data = 'A';
		b.data = 'B';
		c.data = 'C';
		d.data = 'D';
		e.data = 'E';
		f.data = 'F';
		g.data = 'G';
		a.children.add(b);
		a.children.add(c);
		b.children.add(d);
		c.children.add(e);
		d.children.add(f);
		e.children.add(g);
		route = routeToE(a, e);
		for(int i = 0 ; i < route.size() ; i++)
			System.out.println(route.get(i).data);
	}
	
	private static ArrayList<TreeNode> routeToE(TreeNode root, TreeNode end) throws Exception{
		if(root==null)
			throw new Exception("Root is null");
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		route.add(root);
		while(!q.isEmpty())
		{
			temp = q.poll();
			if(temp.children==null) throw new Exception("Child is null");
			for(int i = 0 ; i < temp.children.size() ; i++)
			{
				child = temp.children.get(i);
				q.add(child);
				route.add(child);
				if(child.data == end.data)
					return route;
			}
		}
		return route;
		
	}
} 

