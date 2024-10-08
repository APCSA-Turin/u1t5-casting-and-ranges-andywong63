import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type in a decimal between 100 and 999.99 with up to 2 decimals: ");
        double number = scan.nextDouble();
        int hundredsDigit = (int) number / 100;
        int tensDigit = (int) (number % 100) / 10;
        int onesDigit = (int) (number % 10);
        int tenthsDigit = (int) (number % 1 * 10);
        int hundredthsDigit = (int) (number % 0.1 * 100 + 0.5);
        hundredsDigit = (hundredsDigit + 1) % 10;
        tensDigit = (tensDigit + 1) % 10;
        onesDigit = (onesDigit + 1) % 10;
        tenthsDigit = (tenthsDigit + 1) % 10;
        hundredthsDigit = (hundredthsDigit + 1) % 10;
        System.out.println("The adjusted number is " + hundredsDigit + tensDigit + onesDigit + "." + tenthsDigit + hundredthsDigit);
    }
}