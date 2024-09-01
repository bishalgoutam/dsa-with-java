public class CountDigits {
    public static void main(String[] args) {
        int count = 0;
        long number = 567892;
        count = countDigits(number);
        System.out.println("Count of digits in "+ number+ "=" + count);
    }
    // program to calculate the number of digits
    public static int countDigits(long n) {
        int count=0;
        while (n > 0) {
            n = n / 10;
            count ++;
        }
        return count;
    }

}
