package ArraysAndStrings;
public class matrix {
public static void main(String args[])
{
	int array[][] = new int[2][2];
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			array[i][j] = 1;
		}
	}
	array[0][0] = 0;
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			System.out.print(array[i][j]);
		}
		System.out.println();
	}
	makeZero(array);
}
public static void makeZero(int array[][])
{
	int x = -1;
	int y = -1;
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			if(array[i][j]==0)
			{
				x = i;
				System.out.println("x"+x);
				y = j;
				System.out.println("y"+y);
			}
		}
	}
	if(x >= 0 && y >= 0)
	{
		for(int i=0; i<2; i++)
		{
			array [i][y] = 0;
			
		}
		for(int j=0; j<2; j++)
		{
			array [x][j] = 0;
		}
	}
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			System.out.print(array[i][j]);
		}
		System.out.println();
	}
}
}
