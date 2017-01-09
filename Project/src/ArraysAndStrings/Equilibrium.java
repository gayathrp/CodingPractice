import java.util.HashSet;


public class Equilibrium {
	public static void main(String args[]) {
		int [] input = new int[] {-1, 3, -4, 5, 1, -6, 2, 1};
		getEquilibrium(input);
	}

	private static void getEquilibrium(int[] input) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < input.length ; i++) {
			int equ = input[i];
			int sum = 0;
			int sum1 = 0;
			int sum2 = 0;
			if(i == 0) {
				sum = sum(input, i+1, input.length-1);
				if(equ == sum)
					set.add(i);
			}
			else if(i == input.length-1) {
					sum = sum(input, i, 0);
					if(equ == sum) 
						set.add(i);
			}
			else {
				sum1 = sum(input, i+1, input.length-1);
				sum2 = sum(input, i-1, 0);
				if(sum1 == sum2)
					set.add(i);
			}
		}
		System.out.println(set);
	}
	
	private static int sum (int [] input, int start, int end) {
		int sum = 0;
		if(start < end) {
			for(int i = start ; i <= end ; i++) 
				sum += input[i];
		}
		else if(start >= end) {
			for(int i = start ; i >= end ; i--) 
				sum += input[i];
		}
		System.out.println(sum);
		return sum;
	}
	
}
