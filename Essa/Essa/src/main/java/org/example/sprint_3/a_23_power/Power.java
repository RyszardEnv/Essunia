package org.example.sprint_3.a_23_power;

import org.example.sprint_2.a_10_mult.Mult;

public class Power {

    public static int power(int x, int y){
        if (y == 0)
            return 1;
        if( y < 0)
            throw new IllegalArgumentException("Potęga musi być większa lub rwna 0");
        int result = x;
        int i = 1;
        while (i < y) {
            result = Mult.mult(result, x);
            i++;
        }

        return result;
    }
}
