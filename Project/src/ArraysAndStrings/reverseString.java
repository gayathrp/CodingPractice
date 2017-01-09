/**
 * Created by Gayathri on 11/19/16.
 */
import java.util.ArrayList;

public class reverseString {
    public static void main(String args[]) {
        String str = "gayathri";
        char c = 'h';
        String output = reverse(str, c);
        System.out.print(output);
    }

    private static String reverse(String input, char c) {
        if(input == null) return null;
        int position = position(input, c);
        String end = input.substring(position+1);
        ArrayList<Character> list = new ArrayList<>();
        for(int i = position ; i >= 0 ; i--) {
            list.add(input.charAt(i));
        }
        String start = new String();
        for(char chr : list) {
            start += chr;
        }
        return start+end;
    }

    private static int position(String input, char c) {
        int no = 0;
        for (int i = 0; i < input.length()-1; i++) {
            if (c == input.charAt(i)) {
                no = i;
                break;
            }
        }
        return no;
    }
}

