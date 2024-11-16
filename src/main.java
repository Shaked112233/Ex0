import java.util.Scanner;

public class main {
        public static void main(String[] args) {
                long startTime = System.currentTimeMillis();

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an even number greater than 4: ");
                int n = scanner.nextInt();

                if (n <= 4 || n % 2 != 0) {
                        System.out.println("The number must be even and greater than 4.");
                        scanner.close();
                        return;
                }

                // First pair of primes that add up to n
                for (int i = 2; i <= n / 2; i++) {
                        if (isPrime(i) && isPrime(n - i)) {
                                System.out.println(n + " = " + i + " + " + (n - i));
                                break;
                        }
                }

                // Finding the first pair of primes where the difference is n
                for (int p1 = 2; p1 <= n; p1++) {
                        int p2 = p1 + n;
                        if (isPrime(p1) && isPrime(p2)) {
                                System.out.println(n + " = " + p2 + " - " + p1);
                                break;
                        }
                }

                // Print all prime numbers in the range [2, n)
                System.out.print("Prime numbers in [2, " + n + "): ");
                boolean first = true;
                for (int i = 2; i < n; i++) {
                        if (isPrime(i)) {
                                if (!first) {
                                        System.out.print(", ");
                                }
                                System.out.print(i);
                                first = false;
                        }
                }
                System.out.println();

                // Prime factorization of n
                System.out.print("Prime factorization of " + n + ": ");
                int remaining = n;
                for (int i = 2; i <= remaining; i++) {
                        while (isPrime(i) && remaining % i == 0) {
                                System.out.print(i + " ");
                                remaining = remaining / i;
                        }
                }
                System.out.println();

                scanner.close();

                long endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1000.0;
                System.out.printf("Program runtime: %.3f seconds\n", executionTime);

                // Print the student ID
                String id = "208988030";
                System.out.println("Student ID: " + id);
        }

        // Function to check if a number is prime
        public static boolean isPrime(int num) {
                if (num <= 1) return false;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) return false;
                }
                return true;
        }
}
