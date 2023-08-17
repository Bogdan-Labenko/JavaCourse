import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Task12();
        //drawLine(7,'h','&');
    }

    private static void Task1() {
        String text = """
                Your time is limited,
                  so don’t waste it
                    living someone else’s life”
                      Steve Jobs""";
        System.out.println(text);
    }

    private static void Task2() {
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter percent: ");
        int percent = scanner.nextInt();
        System.out.println("Result: " + ((double) (number * percent) / 100));
    }

    private static void Task3() {
        System.out.print("Enter 1 digit of number: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2 digit of number: ");
        int b = scanner.nextInt();
        System.out.print("Enter 3 digit of number: ");
        int c = scanner.nextInt();
        String result = a + b + c + "";
        System.out.println(result);
    }

    private static void Task4() {

        System.out.print("Enter six-digit number: ");
        int number = scanner.nextInt();

        String numberString = String.valueOf(number);
        if (numberString.length() != 6) {
            System.out.println("Error: number is not six-digit!");
            return;
        }
        char[] digits = numberString.toCharArray();
        //замена 1 и 6 числа
        char temp = digits[5];
        digits[5] = digits[0];
        digits[0] = temp;
        //замена 2 и 5 числа
        temp = digits[4];
        digits[4] = digits[1];
        digits[1] = temp;
        String result = new String(digits);
        System.out.println(result);
    }

    private static void Task5() {
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }

    private static void Task6() {
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        System.out.println("0 - miles, 1 - inches, 2 - yards");
        int type = scanner.nextInt();

        switch (type) {
            case 0 -> System.out.printf("Meters: %.3f | Miles: %.3f%n", meters, meters * 0.000621371192);
            case 1 -> System.out.printf("Meters: %.3f | Inches: %.3f%n", meters, meters * 39.3700787);
            case 2 -> System.out.printf("Meters: %.3f | Yards: %.3f%n", meters, meters * 1.0936133);
        }
    }

    private static void Task7() {
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        int min, max;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        System.out.print("Result: ");
        for (int i = min; i < max; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void Task8() {
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        int min, max;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        for (int i = min; i <= max; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d*%d=%d | ", i, j, i * j);
            }
            System.out.println();
        }
    }

    private static void Task9() {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(-15, 15);
        }
        int min = 15, max = -15, negatives = 0, positives = 0, zeros = 0;
        for (int num : array) {
            if (num == 0) zeros++;
            else if (num > 0) positives++;
            else negatives++;
            if (num > max) max = num;
            else if (num < min) min = num;
            System.out.print(num + " ");
        }
        System.out.println("\nPositives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Zeros: " + zeros);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    private static void Task10() {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(-15, 15);
        }
        int[] positivesArray = new int[15];
        int[] negativesArray = new int[15];
        int[] evenArray = new int[15];
        int[] oddArray = new int[15];

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int num : array) {
            if (num > 0) positivesArray[positiveCount++] = num;
            else negativesArray[negativeCount++] = num;
            if (num % 2 == 0) evenArray[evenCount++] = num;
            else oddArray[oddCount++] = num;
            System.out.print(num + " ");
        }

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int[] negativeNumbers = new int[negativeCount];
        int[] positiveNumbers = new int[positiveCount];

        System.arraycopy(evenArray, 0, evenNumbers, 0, evenCount);
        System.arraycopy(oddArray, 0, oddNumbers, 0, oddCount);
        System.arraycopy(negativesArray, 0, negativeNumbers, 0, negativeCount);
        System.arraycopy(positivesArray, 0, positiveNumbers, 0, positiveCount);

        System.out.println("Original Array: " + java.util.Arrays.toString(array));
        System.out.println("Even Numbers: " + java.util.Arrays.toString(evenNumbers));
        System.out.println("Odd Numbers: " + java.util.Arrays.toString(oddNumbers));
        System.out.println("Negative Numbers: " + java.util.Arrays.toString(negativeNumbers));
        System.out.println("Positive Numbers: " + java.util.Arrays.toString(positiveNumbers));
    }

    //Task11
    private static void drawLine(int length, char direction, char symbol) {
        if (length <= 0) {
            System.out.println("Invalid length");
            return;
        }

        if (direction == 'H' || direction == 'h') {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction == 'V' || direction == 'v') {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Invalid direction");
        }
    }

    private static void Task12() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("1 - ascending, 2 - descending : ");
        int sortOrder = scanner.nextInt();

        if (sortOrder == 1) {
            Arrays.sort(array);
        } else if (sortOrder == 2) {
            Arrays.sort(array);
            reverseArray(array);
        } else {
            System.out.println("Incorrect value.");
            return;
        }

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}