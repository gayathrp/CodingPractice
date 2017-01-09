import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ManhattanDistance {
	public static void main(String args[]) {
		int mat[][] = new int[][] {{1,2,2},{4,4,6},{7,8,8}};
		getDuplicates(mat, 3, 3, 2);
	}

	private static void getDuplicates(int[][] mat, int row, int col, int dis) {
		HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<>();
		for(int i = 0 ; i < row ; i++) {
			for (int j = 0 ; j < col ; j++) {
				if(hmap.containsKey(mat[i][j]))
					addToList(hmap.get(mat[i][j]), i, j);
				else {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					hmap.put(mat[i][j], list);
				}
			}
		}
		System.out.println(hmap);
		duplicatesMinManhattanDistance(hmap, dis);
	}

	private static void addToList(ArrayList<Integer> list, int row, int col) {
		list.add(row);
		list.add(col);
	}
	
	private static void duplicatesMinManhattanDistance(HashMap<Integer, ArrayList<Integer>> hmap, int dis) {
		HashSet<Integer> set = new HashSet<>();
		for(int key : hmap.keySet()) {
			ArrayList<Integer> list = hmap.get(key);
			if(list.size() > 2) { 
				for(int i = 0 ; i < list.size() ; i+=2) {
					for(int j = i+2 ; j < list.size() ; j+=2) {
						int rowDist = list.get(j) - list.get(i);
						int colDist = list.get(j+1) - list.get(i+1);
						int rowCol = rowDist + colDist;
						if(rowCol <= dis) 
							set.add(key);
					}
				}
			}
		}
		System.out.println(set);
	}
}
