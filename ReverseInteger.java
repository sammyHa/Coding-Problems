public class ReverseInteger {
    public static void main(String[] args) {
        int num = -2147483648;
        System.out.println("original " + num);
        System.out.println(reverseInteger(num));
    }

    public static int reverseInteger(int n){
        boolean negative = false;
        if(n < 0){

            negative = true;
            n*=-1;
            System.out.println(n);
        }

        long reverse = 0;
        while (n > 0){
            reverse = reverse * 10 + n % 10;
            n /= 10;

        }
        if (reverse > Integer.MAX_VALUE ){
            return 0;
        }
        return negative? (int)(-1 * reverse) : (int) reverse;
    }
}
