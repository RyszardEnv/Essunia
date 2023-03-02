package org.example.sprint_1.a_08_christmasTree;

public class ChristmasTree {

    void printChristmasTree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.println(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = n; l <= 1; l++) {
                for (int h = 1; h <= n; h++) {
                    System.out.print(" ");
                }
            }
        }
    }
}
