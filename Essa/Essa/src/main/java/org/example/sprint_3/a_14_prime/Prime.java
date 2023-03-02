package org.example.sprint_3.a_14_prime;

public class Prime {

    public static int countPrimeNumbersSmallerThanGivenNumber(int n) {
        int countPrimeNumbers = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                countPrimeNumbers++;
            }
        }
        return countPrimeNumbers;
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
