package ArraysAndStrings;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class generateRandomStrings {
	public static void main(String args[])
	{
		String str = "ABCD";
		int count = 4;
		ArrayList list = new ArrayList();
		while(list.size()!=count)
		{
			String output = generateString(str);
			if(list.isEmpty())
			{
				list.add(output);
			}
			else if(!list.contains(output))
			list.add(output);
		}
		System.out.println(list);

	}
	
	public static String generateString(String input)
	{
		Random rand = new Random();
		ArrayList list = new ArrayList();
		int  n = 0;
		char [] array = new char [4];
		HashMap<Integer, Character> hmap = new HashMap<>();
		for(int i = 0 ; i < input.length() ; i++)
		{
			hmap.put(i+1, input.charAt(i));
		}
		while(list.size()!=input.length())
		{
			n = rand.nextInt(input.length()) + 1;
			if(list.isEmpty())
			{
				list.add(n);
			}
			else if(!list.contains(n))
			{
					list.add(n);
			}
		}
		for(int i = 0 ; i < hmap.size() ; i++)
		{
				if(hmap.containsKey(list.get(i)))
				{
					array[i] = hmap.get(list.get(i));
				}
		}
		return new String(array);
	}
}


