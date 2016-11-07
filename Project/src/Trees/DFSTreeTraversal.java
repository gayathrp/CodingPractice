package Trees;
import java.util.ArrayList;
import java.util.Stack;

public class DFSTreeTraversal {


	public static void dfs(TreeNode root)
	{
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty())
		{
			TreeNode temp = s.pop();
			System.out.println(temp.data);
			if (temp.children == null)
				continue;
			for(int i = 0 ; i < temp.children.size() ; i++) {
				s.push(temp.children.get(i));
			}
		}
	}
	
	public static void main(String args[])
	{
		TreeNode one = new TreeNode();
		TreeNode two = new TreeNode();
		TreeNode three = new TreeNode();
		TreeNode four = new TreeNode();
		TreeNode five = new TreeNode();
		TreeNode six = new TreeNode();
		one.data = 1;
		two.data = 2;
		three.data = 3;
		four.data = 4;
		five.data = 5;
		six.data = 6;
		ArrayList<TreeNode> childrenOne = new ArrayList<>();
		childrenOne.add(two);
		childrenOne.add(three);
		one.children = childrenOne;
		ArrayList<TreeNode> childrenTwo = new ArrayList<>();
		childrenTwo.add(four);
		childrenTwo.add(five);
		two.children = childrenTwo;
		ArrayList<TreeNode> childrenFour = new ArrayList<>();
		childrenFour.add(six);
		four.children = childrenFour;
		dfs(one);
	}


}
	

	
	
	

