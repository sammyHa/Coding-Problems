import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String arr[] = {"flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] str) {

        if (str.length == 0){
            return "";
        }
        StringBuilder longestPrefix = new StringBuilder();
        int index = 0;
        for (char c : str[0].toCharArray()) {
            for (int i = 0; i < str.length; i++) {
                if (index >= str[i].length() || c != str[i].charAt(index)) {

                    return longestPrefix.toString();
                }
            }
            longestPrefix.append(c);
            index++;
        }
        return longestPrefix.toString();
    }
}
