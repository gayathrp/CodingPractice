
public class FIndElementInArray {
	public static void main(String args[]) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		findElement(matrix, 5);
	}

	private static void findElement(int[][] matrix, int no) {
		int i = 0;
		int n = matrix.length - 1;
		System.out.println(n);
		while(i < matrix.length && n >= 0) {
			if(matrix[i][n] == no) {
				System.out.println(i);
				System.out.println(n);
				break;
			}
			else if(matrix[i][n] < no)
				i++;
			else
				n--;
		}
		
	}
	
}
