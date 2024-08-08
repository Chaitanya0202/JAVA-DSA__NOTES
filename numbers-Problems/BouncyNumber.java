package numbers;

public class BouncyNumber {

    public static void main(String[] args) {
        int num = 132; // Change this to test different numbers
        if (isBouncy(num)) {
            System.out.println(num + " is a Bouncy Number.");
        } else {
            System.out.println(num + " is not a Bouncy Number.");
        }
    }

    public static boolean isBouncy(int num) {
        boolean increasing = false;
        boolean decreasing = false;

        int lastDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit < lastDigit) {
                increasing = true;
            } else if (currentDigit > lastDigit) {
                decreasing = true;
            }

            if (increasing && decreasing) {
                return true; // It's a bouncy number
            }

            lastDigit = currentDigit;
            num /= 10;
        }

        return false; // Not a bouncy number
    }
}
