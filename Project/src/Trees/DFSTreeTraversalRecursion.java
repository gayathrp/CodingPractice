package Trees;
import java.util.ArrayList;

public class DFSTreeTraversalRecursion {
	public static void main(String args[])
	{
		System.out.println("Recursive DFS");
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
		dfsRecursion(one);
	}

	private static void dfsRecursion(TreeNode root)
	{
		if(root == null)
			return;
		
		if(root.children == null)
			return;
		System.out.println(root.data);
		for(int i = 0; i < root.children.size(); i++)
		{
			dfsRecursion(root.children.get(i));
		}
		
	}
}



