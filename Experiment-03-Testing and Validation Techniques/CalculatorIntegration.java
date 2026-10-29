import java.util.Scanner;

public class CalculatorIntegration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Choose operation (+, -, *, /):");
        String op = sc.next();

        switch(op) {
            case "+": System.out.println("Result = " + c.add(a, b)); break;
            case "-": System.out.println("Result = " + c.subtract(a, b)); break;
            case "*": System.out.println("Result = " + c.multiply(a, b)); break;
            case "/":
                try { System.out.println("Result = " + c.divide(a, b)); }
                catch (ArithmeticException e) { System.out.println("Error: Division by zero"); }
                break;
            default: System.out.println("Invalid operation");
        }
    }
}
