 //1. Write a Java program that uses lambda expressions to perform arithmetic operations
 //  (addition, subtraction, multiplication, and division) on two numbers.
 //  Create lambda expressions for each operation and then apply them to the numbers.

interface ArithmeticOperation {
    double operate(double a, double b);
}
public class ArithmeticLambdaExample {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 10;
        // Lambda expression for addition
        ArithmeticOperation addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        ArithmeticOperation subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        ArithmeticOperation multiplication = (a, b) -> a * b;

        // Lambda expression for division
        ArithmeticOperation division = (a, b) -> {
            if (b == 0) {
                System.out.println("Division by zero is not allowed.");
                return 0;
            }
            return a / b;
        };

        // Applying operations
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Addition: " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + multiplication.operate(num1, num2));
        System.out.println("Division: " + division.operate(num1, num2));
    }
}
