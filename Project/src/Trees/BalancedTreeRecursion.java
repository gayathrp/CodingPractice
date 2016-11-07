package Trees;

public class BalancedTreeRecursion {
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
		if(root==null) 
			return 0;
		int leftHeight = getHeight(root.left);
		if(leftHeight == -1) 
			return -1;
		int rightHeight = getHeight(root.right);
		if(rightHeight == -1) 
			return -1;
		int height = Math.abs(leftHeight - rightHeight);
		if(height > 1) 
			return -1;
		else
			return Math.max(leftHeight,rightHeight)+1;
		
	}
	
	private static void isBalanced(Node root)
	{
		if(getHeight(root)==-1)
			System.out.println("Tree is not balanced");
		else
			System.out.println("Tree is balanced");	
	}
}

