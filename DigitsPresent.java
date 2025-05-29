public class DigitsPresent {
    static int countDigit(int n,int flag) {

        if (n <= 9) {
            return flag+1;
        }
            return countDigit(n / 10, flag + 1);

    }
    public static void main(String[]args)
        {
        int n=73767;
        System.out.println(countDigit(n,0));
    }
}
