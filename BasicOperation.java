import java.util.Scanner;

public class BasicOperation {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            // Fibonacci
            int a = 0, b = 1;
            System.out.print("Fibonacci: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();

            // Palindrome
            int rev = 0, temp = n;
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            System.out.println((rev == n) ? "Palindrome" : "Not Palindrome");

            // Factorial
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            System.out.println("Factorial: " + fact);

            // Even or Odd
            System.out.println((n % 2 == 0) ? "Even" : "Odd");
        }
    }
}
