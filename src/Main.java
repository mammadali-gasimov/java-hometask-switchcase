import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --------- Task 1 -------
//        System.out.println("Enter one of these three colors: yellow, red, green");
//        String color = scanner.nextLine();
//        switch (color) {
//            case "yellow" -> System.out.println("Get ready!");
//            case "red" -> System.out.println("Stop!");
//            case "green" -> System.out.println("Go!");
//            default -> System.out.println("Wrong color!");
//        }


        // -------- Task 2 -----------
        System.out.println("Possible currencies: USD, EUR, AZN");
        System.out.println("Exchange from currency:");
        String fromCurrency = scanner.nextLine();

        System.out.println("Exchange to currency:");
        String toCurrency = scanner.nextLine();

        System.out.println("Amount:");
        double amount = scanner.nextDouble();

        while (amount <= 0) {
            System.out.println("Amount more than 0:");
            amount = scanner.nextDouble();
        }

        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {
                    case "USD":
                        System.out.println("Exchanged amount: " + amount);
                        break;
                    case "AZN":
                        System.out.println("Exchanged amount: " + amount * 1.7);
                        break;
                    case "EUR":
                        System.out.println("Exchanged amount: " + amount * 0.92);
                        break;
                    default:
                        System.out.println("Unsupported currency!");
                        break;
                }
                break;

            case "AZN":
                switch (toCurrency) {
                    case "USD":
                        System.out.println("Exchanged amount: " + amount / 1.7);
                        break;
                    case "AZN":
                        System.out.println("Exchanged amount: " + amount);
                        break;
                    case "EUR":
                        System.out.println("Exchanged amount: " + amount * 0.54);
                        break;
                    default:
                        System.out.println("Unsupported currency!");
                        break;
                }
                break;

            case "EUR":
                switch (toCurrency) {
                    case "USD":
                        System.out.println("Exchanged amount: " + amount * 1.086);
                        break;
                    case "AZN":
                        System.out.println("Exchanged amount: " + amount * 1.849);
                        break;
                    case "EUR":
                        System.out.println("Exchanged amount: " + amount);
                        break;
                    default:
                        System.out.println("Unsupported currency!");
                        break;
                }
                break;

            default:
                System.out.println("Unsupported currency!");
                break;
        }
    }
}