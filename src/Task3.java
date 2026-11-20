
public class Task3 {

    public static int sumOfDigits(int x) {

        if (x < 10) {
            return x;
        }

        return (x % 10) + sumOfDigits(x / 10);
    }

    public static void main(String[] args) {

        int number = 1342;

        System.out.println("Sum of digits: " +
                sumOfDigits(number));
    }
}
