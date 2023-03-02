package org.example.sprint_1.a_08_christmasTree;

public class ChristmasTree {
  
    public static void printChristmasTree(int n) {
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n - i; j++)
               System.out.print(" ");
           for (int k = 0; k < (2 * i + 1); k++)
               System.out.print("*");
           System.out.println();
       }
   }
}
