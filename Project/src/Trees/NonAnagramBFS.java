package Trees;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;

public class NonAnagramBFS {

	
	public static void main(String args[])
	{
		TreeNode a = new TreeNode();
		TreeNode b = new TreeNode();
		TreeNode c = new TreeNode();
		TreeNode d = new TreeNode();
		a.data = "ABC";
		b.data = "BCD";
		c.data = "CBA";
		d.data = "BAC";
		a.children.add(b);
		a.children.add(c);
		c.children.add(d);
		HashMap<String, ArrayList<TreeNode>> map = new HashMap<>();
		map = findNonAnagram(a);
		for(String key : map.keySet())
		{
			if(map.get(key).size()==1)
				System.out.println(map.get(key).get(0).data);
		}
	}

	private static HashMap<String, ArrayList<TreeNode>> findNonAnagram(TreeNode root)
	{
		if(root==null) return null;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		String sortedRoot = Sort(root);
		HashMap<String, ArrayList<TreeNode>> hmap = new HashMap<>();
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		list.add(root);
		hmap.put(sortedRoot, list);
		while(!q.isEmpty())
		{

			TreeNode temp = q.poll();
			if(temp.children == null) return null;
			for(int i = 0 ; i < temp.children.size() ; i++)
			{
				String sortedChild = Sort(temp.children.get(i));
				q.add(temp.children.get(i));
				if(hmap.containsKey(sortedChild))
				{
					hmap.get(sortedChild).add(temp.children.get(i));
				}
				else
				{
					list = new ArrayList<TreeNode>();
					list.add(temp.children.get(i));
					hmap.put(sortedChild, list);
				}
			}

		}
	return hmap;

	}
	
	private static String Sort(TreeNode root){
		char [] str = ((String) root.data).toCharArray();
		Arrays.sort(str);
		return new String(str);
		
	}
}

