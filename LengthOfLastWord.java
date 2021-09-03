public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = " d b ";
        int index = lenghtOfLastWord(s);
        System.out.println(index);
    }

    public static int lenghtOfLastWord(String s){

        int counter = 0;
        for (int i = s.length() -1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                counter++;
            }else if (counter > 0){
                return counter;
            }
        }
        return counter;
    }
}
