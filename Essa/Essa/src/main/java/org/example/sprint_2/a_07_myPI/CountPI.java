package org.example.sprint_2.a_07_myPI;

public class CountPI {
    public static void main(String[] args) {
        double v = countPi(1);
        System.out.println(v);
    }
    public static double countPi(int n) {
        int odd = 1;
        double pi = 0.0;

        for (int i = 1; i <= n; i++) {
            double currentTerm = 0.0;
            if (i % 2 == 0) {
                currentTerm = (double) -4 / odd;
            } else {
                currentTerm = (double) 4 / odd;
            }
            odd = odd + 2;
            pi = pi + currentTerm;
        }
        return pi;
    }
}
