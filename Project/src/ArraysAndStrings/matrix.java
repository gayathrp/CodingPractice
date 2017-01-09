public class matrix {
	public static void main(String args[]) {
		int[][] matrix = new int[3][3];
		for (int row = 0; row < 3; row ++)
			for (int col = 0; col < 3; col++)
				matrix[row][col] = 1 + row * 3 + col;
		matrix[1][2] = 0;
		for (int row = 0; row < 3; row ++)
			for (int col = 0; col < 3; col++)
				System.out.println(matrix[row][col]);
		replaceMatrix(matrix);
	}
	private static int [][] replaceMatrix(int [][] mat) {
		boolean rows[] = new boolean[mat.length];
		boolean cols[] = new boolean[mat.length];
		for (int row = 0; row < 3; row ++) {
			for (int col = 0; col < 3; col++) {
				if(mat[row][col] == 0) {
					rows[row] = true;
					cols[col] = true;
				}
			}
		}
		for (int row = 0; row < 3; row ++) {
			for (int col = 0; col < 3; col++) {
				if(rows[row] || cols[col])
					mat[row][col] = 0;
			}
		}
		for (int row = 0; row < 3; row ++)
			for (int col = 0; col < 3; col++)
				System.out.println(mat[row][col]);
		return mat;
	}
}
