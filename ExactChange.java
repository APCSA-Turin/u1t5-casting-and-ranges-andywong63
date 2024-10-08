import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a specific amount of money:\n> $");
        double money = scanner.nextDouble();
        scanner.nextLine();

        int quarters = (int) (money / 0.25);
        money -= quarters * 0.25;
        int dimes = (int) (money / 0.1);
        money -= dimes * 0.1;
        int nickels = (int) (money / 0.05);
        money -= nickels * 0.05;
        int pennies = (int) (money / 0.01 + 0.5);

        System.out.println("Minimum number of coins needed: " + (quarters + dimes + nickels + pennies));
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        scanner.close();
    }
}