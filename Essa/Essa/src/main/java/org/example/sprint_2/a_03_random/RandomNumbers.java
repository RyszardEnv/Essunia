package org.example.sprint_2.a_03_random;

public class RandomNumbers {

    public static int random(int x){
        if(x == 0)
            throw new IllegalArgumentException("Nie może być 0 elementów");
        long seed = System.currentTimeMillis();
        seed *= 123456;
        seed += Integer.MAX_VALUE;
        seed %= 67891;
        return (int) seed % x;
    }

}
