import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    Main(){

    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Task4();
    }
    private static void Task1(){
        String text = """
            Your time is limited,
              so don’t waste it
                living someone else’s life”
                  Steve Jobs""";
        System.out.println(text);
    }
    private static void Task2(){
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter percent: ");
        int percent = scanner.nextInt();
        System.out.println("Result: " + ((double)(number * percent) / 100));
    }
    private static void Task3(){
        System.out.print("Enter 1 digit of number: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2 digit of number: ");
        int b = scanner.nextInt();
        System.out.print("Enter 3 digit of number: ");
        int c = scanner.nextInt();
        String result = a + b + c + "";
        System.out.println(result);
    }
    private static void Task4(){

        System.out.print("Enter six-digit number: ");
        int number = scanner.nextInt();

        String numberString = String.valueOf(number);
        if(numberString.length() != 6){
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
}