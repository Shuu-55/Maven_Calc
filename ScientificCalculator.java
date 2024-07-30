import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Sin");
            System.out.println("6: Cos");
            System.out.println("7: Tan");
            System.out.println("8: Log");
            System.out.println("9: Log10");
            System.out.println("10: Exponential");
            System.out.println("11: Power");
            System.out.println("12: Exit");

            int choice = scanner.nextInt();

            if (choice == 12) {
                break;
            }

            double num1 = 0, num2 = 0;
            if (choice >= 1 && choice <= 4 || choice == 11) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } else if (choice >= 5 && choice <= 10) {
                System.out.print("Enter the number: ");
                num1 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                case 5:
                    System.out.println("Result: " + Math.sin(num1));
                    break;
                case 6:
                    System.out.println("Result: " + Math.cos(num1));
                    break;
                case 7:
                    System.out.println("Result: " + Math.tan(num1));
                    break;
                case 8:
                    if (num1 > 0) {
                        System.out.println("Result: " + Math.log(num1));
                    } else {
                        System.out.println("Error! Logarithm of non-positive number.");
                    }
                    break;
                case 9:
                    if (num1 > 0) {
                        System.out.println("Result: " + Math.log10(num1));
                    } else {
                        System.out.println("Error! Logarithm of non-positive number.");
                    }
                    break;
                case 10:
                    System.out.println("Result: " + Math.exp(num1));
                    break;
                case 11:
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
        scanner.close();
    }
}
