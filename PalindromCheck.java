public class PalindromCheck {
    public static void main(String[] args) {
        boolean palindrom = true;
        int input_number = 4554;
        palindrom = isPalindrom(input_number);
        if(palindrom == true){
            System.out.println(input_number+" is a Palindrom");
        }
        else{
            System.out.println(input_number+" is not a Palindrom");
        }
    }
    // program to calculate the number of digits
    public static boolean isPalindrom(int n) {
        int reverse = 0;
        int remainder = n;
        int last_digit;
        // reverse the given number
        while(remainder != 0) {
            last_digit = remainder % 10;
            reverse = (reverse * 10) + last_digit;
            remainder = remainder / 10;
        }
        // Check if reverse is same as the given number
        if(n == reverse) {
            return true;
        }
        else{
            return false;
        }
    }
}
