package Trees;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NonAnagramBFS {
	
	static TreeNode temp;
	
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
		findNonAnagram(a);
	}
	
	private static void findNonAnagram(TreeNode root)
	{
		if(root==null) return;
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<TreeNode> nonAnagrams = new ArrayList<>();
		q.add(root);
		String abc = (String)root.data;
		while(!q.isEmpty())
		{
			temp = q.poll();
			if(temp.children == null) return;
			for(int i = 0 ; i < temp.children.size() ; i++)
			{
				q.add(temp.children.get(i));
				if(!abc.equalsIgnoreCase(Sort(temp.children.get(i))))
				{
					nonAnagrams.add(temp.children.get(i));
				}
			}
			
		}
		for(int i = 0 ; i < nonAnagrams.size() ; i++)
		{
			System.out.println("Non Anagrams: "+nonAnagrams.get(i).data);
		}
		
	}
	
	private static String Sort(TreeNode root){
		char [] str = ((String) root.data).toCharArray();
		Arrays.sort(str);
		return new String(str);
		
	}
}

