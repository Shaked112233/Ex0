
/**
 Pseudocode
prime = num ,i = 2 ,i <= num (sqr) ,check all numbers between i=>num if num divisible i  f, else T.
 1. input even number > 4 = n
 2.start program runtime
 3. input n>4  , if n<4 or n % 2 != 0 return
 4.section a -// i =2 , i<=n check if i & (n-i) prime's if true print if not i++ and loop until prime's
 5.section b -// loop => p1 = 2 , p1<=n , p2 = n+p1 check if p1&p2 prime if t print p2-p1=n if not p1++ until p1&p2 prime.
 6.section c -// i = 2 , i<=n , if i prime print (i) then i++ and loop until i<=n.
 7.section d -//n=remaining, i=2 , i<= remaining,
 if i prime & remaining % i == 0 do remaining/i and remaining = remaining/i loop until False
 then add 1 to i (i++) and start loop again until i<= remaining
 8.section e - // String id = myId then print id.
 9.end program runtime.

 */

import java.util.Scanner;

public class main {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an even number greater than 4: ");
                int n = scanner.nextInt();

                long startTime = System.currentTimeMillis();

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
                boolean first = true; // for "," in output
                for (int i = 2; i < n; i++) {
                        if (isPrime(i)) {
                                if (!first) {
                                        System.out.print(", ");
                                }
                                System.out.print(i);
                                first = false; // //  for "," in output
                        }
                }
                System.out.println();

                // factorization of n
                System.out.print("Prime factorization of " + n + " = ");
                boolean second = true;   //  for "*" in output
                int remaining = n;
                for (int i = 2; i <= remaining; i++) {
                        while (isPrime(i) && remaining % i == 0) {
                                if (!second) {            //  for "*" in output
                                        System.out.print("*");
                                }
                                System.out.print(i);
                                remaining = remaining / i;
                                second = false;        //  for "*" in output
                        }
                }
                System.out.println();


                scanner.close();

                // Print the student ID
                String id = "208988030";
                System.out.println("Student ID: " + id);

                long endTime = System.currentTimeMillis();
                double executionTime = (endTime - startTime) / 1000.0;
                System.out.printf("Program runtime: %.3f seconds\n", executionTime);


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
