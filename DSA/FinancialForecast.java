package Cognizant_JAVA_FSE_HandsOn.DSA;
import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double rate, int years) {
        // Base case: if 0 years left, return current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: grow one year at a time
        return predictFutureValue(currentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter initial investment amount: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRate = scanner.nextDouble() / 100.0;

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        // Forecasting
        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.printf("\nPredicted future value after %d years: ₹%.2f\n", years, futureValue);

        scanner.close();
    }
}
