import java.util.ArrayList;


public class TreePath {
	
	private static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String args[]) {
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		Node five = new Node();
		Node six = new Node();
		Node seven = new Node();
		one.data = 1;
		two.data = 2;
		three.data = 3;
		four.data = 4;
		five.data = 5;
		six.data = 6;
		seven.data = 7;
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		int [] path = new int[500];
		int len = 0;
		if(isPath(three, seven))
			System.out.println("Path exists");
		getAllPath(one, path, len);
		System.out.println(list);
	}

	private static void getAllPath(Node one, int [] path, int len) {
		if(one == null)
			return;
		path[len] = one.data;
		len++;
		if(one.left == null && one.right == null) {
			addToList(path, len);
		}
		getAllPath(one.left, path, len); 
		getAllPath(one.right, path, len);
	}

	private static void addToList(int[] path2, int len2) {
		StringBuffer str = new StringBuffer();
		for(int i = 0; i < len2 ; i++) {
			str.append(path2[i]);
		}
		list.add(Integer.parseInt(str.toString()));
	}

	private static boolean isPath(Node one, Node seven) {
		if(one == null) return false;
		if(one == seven)
			return true;
		return isPath(one.left, seven) || isPath(one.right, seven);
	}
}
