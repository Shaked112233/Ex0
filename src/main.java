public class main {
}



/*pseudocode - making the plan
(a)
1) we define the numbers area -  4<n<4*10^18. (start from 4)
2) chose even number n.(4,6...4*10^8)
3) define the prime number[(little pharma)-take 2^(n-1) % n if =1 T, if not F.
4) make n-1 and check if that number is prime,if T add 1 and finish.
5) if F,make n-2 and repeat until its prime. when prime stop and mark it in "L"
6) take n-L=D , check if D is prime if T- finish with L+D. if not go back to raw 5

(b)
1) L+D = N , array all prime numbers between 2=>N ,organize numbers from low=>high // Minimum variable = MV
2) take the MV and add to N, check if this new number prime, if prime print "the number-MV="
3)if F add 1 to MV and add it to N until it is prime.

(c)
how many numbers in the array

(d)
Use the array for the prime numbers,
take N and divide it in MV+1 if the new numbers whole divide again with MV+1 continue until not natural.
if it 1 print all. if not make the same processes with MV+2\MV+3 until its 1.

(e)
final run time - beginning run time

(f)
string id = "208988030"
system.out.println("My ID is:" + id);
 */