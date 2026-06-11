import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");

        System.out.println("Select Base Currency:");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        System.out.print("Enter choice: ");
        int fromChoice = sc.nextInt();

        System.out.println("\nSelect Target Currency:");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        System.out.print("Enter choice: ");
        int toChoice = sc.nextInt();

        System.out.print("\nEnter Amount: ");
        double amount = sc.nextDouble();

        String fromCurrency = "";
        String toCurrency = "";
        double rate = 1.0;

        if (fromChoice == 1 && toChoice == 2) {
            fromCurrency = "USD";
            toCurrency = "INR";
            rate = 83.5;
        } else if (fromChoice == 2 && toChoice == 1) {
            fromCurrency = "INR";
            toCurrency = "USD";
            rate = 0.012;
        } else if (fromChoice == 1 && toChoice == 3) {
            fromCurrency = "USD";
            toCurrency = "EUR";
            rate = 0.92;
        } else if (fromChoice == 3 && toChoice == 1) {
            fromCurrency = "EUR";
            toCurrency = "USD";
            rate = 1.09;
        } else if (fromChoice == 2 && toChoice == 3) {
            fromCurrency = "INR";
            toCurrency = "EUR";
            rate = 0.011;
        } else if (fromChoice == 3 && toChoice == 2) {
            fromCurrency = "EUR";
            toCurrency = "INR";
            rate = 90.5;
        } else if (fromChoice == toChoice) {
            rate = 1.0;

            if (fromChoice == 1) {
                fromCurrency = toCurrency = "USD";
            } else if (fromChoice == 2) {
                fromCurrency = toCurrency = "INR";
            } else {
                fromCurrency = toCurrency = "EUR";
            }
        } else {
            System.out.println("Invalid Currency Choice!");
            sc.close();
            return;
        }

        double convertedAmount = amount * rate;

        System.out.println("\n===== Conversion Result =====");
        System.out.println(amount + " " + fromCurrency +
                " = " + convertedAmount + " " + toCurrency);

        sc.close();
    }
}