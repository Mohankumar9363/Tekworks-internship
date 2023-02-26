import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char option;
        do {
            double unit = getUnits(s);
            double amount = calculateBillAmount(unit);
            printBillAmount(amount);
            System.out.println("Do you want to check another year? (y/n)");
            option = s.next().charAt(0);
        } while (option != 'n');
    }

    public static double getUnits(Scanner s) {
        System.out.println("Enter no of units:");
        double units = s.nextDouble();
        return units;
    }

    public static double calculateBillAmount(double units) {
        double amount;
        if (units <= 50) {
            amount = units * 0.5;
        } else if (units <= 150) {
            amount = units * 0.75;
        } else if (units <= 250) {
            amount = units * 1.20;
        } else {
            amount = units * 1.50;
        }
        return amount;
    }

    public static void printBillAmount(double amount) {
        System.out.println("Bill amount is " + amount);
    }
}