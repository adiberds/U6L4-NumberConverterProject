import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8 or 10): ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        int base = Integer.parseInt(choice);

        System.out.print("Enter your number: ");
        String number = s.nextLine();
        int n = Integer.parseInt(number);

        s.close();

        NumberConverter nc = new NumberConverter(n, base);
        int[] digits = nc.getDigits();
        System.out.print("Digit array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println("Number: " + nc.displayOriginalNumber());

        if (base != 10) {
            System.out.println("Converted to Decimal: " + nc.convertToDecimal());
        }
        if (base != 2) {
            System.out.print("Converted to Binary: ");
            int[] binary = nc.convertToBinary();
            for (int bit : binary) {
                System.out.print(bit);
            }
            System.out.println();
        }
        if (base != 8) {
            System.out.print("Converted to Oct: ");
            int[] octal = nc.convertToOctal();
            for (int digit : octal) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}

