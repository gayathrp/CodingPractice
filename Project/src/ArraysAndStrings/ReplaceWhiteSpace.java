public class ReplaceWhiteSpace {
    public static void main(String args[]) {
        char [] values = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', ' ', ' '};
        int length = 11;
        replaceStr(values, length);
    }
    private static char[] replaceStr(char [] input, int length) {
        System.out.println(input);
        int count = 0;
        for(int i = 0 ; i < length ; i++) {
            if(input[i] == ' ')
                count++;
        }
        int newlength = length + count * 2;
        System.out.println(newlength);
        input[newlength] = ' ';
        for(int j = length-1 ; j >= 0 ; j--) {
            if(input[j] == ' ') {
                input[newlength-1] = '0';
                input[newlength-2] = '2';
                input[newlength-3] = '%';
                newlength = newlength - 3;
            }
            else {
                input[newlength-1] = input[j];
                newlength = newlength - 1;
            }
        }
        System.out.println(input);
        return input;
    }
}

