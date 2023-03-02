package org.example.sprint_2.a_10_mult;

public class Mult {
    public static int mult(int x, int y) {
        int result = 0;
        int absX = x < 0 ? ~x + 1 : x;
        int absY = y < 0 ? ~y + 1 : y;
        boolean sign = (x < 0 ^ y < 0); //((x < 0 && y > 0) || (x > 0 && y < 0))

        int i = 0;
        while (i < absY) {
            int j = 0;
            while (j < absX) {
                result++;
                j++;
            }
            i++;
        }

        if (sign)
            result = ~result + 1;

        return result;
    }
}
