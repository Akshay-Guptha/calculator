import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("--- Java Console Calculator ---");
        System.out.print("Enter first number: ");
        double first = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        double second = reader.nextDouble();

        double result;

        // Perform operation based on the operator
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.printf("Error! Operator is not correct");
                return;
        }

        // Display the result
        System.out.printf("%.2f %c %.2f = %.2f", first, operator, second, result);
        
        reader.close();
    }
}